package com.rent.controller;


import com.rent.bean.*;
import com.rent.common.Result;
import com.rent.mapper.OrderMapper;
import com.rent.mapper.RentalinfoMapper;
import com.rent.service.OrdermanagementService;
import com.rent.service.ReviewService;
import com.rent.service.impl.OrdermanagementServiceImpl;
import com.rent.service.impl.ReviewServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Api("订单控制")
@RestController
public class OrderController {

    @Autowired
    OrdermanagementService ordermanagementServiceimpl;
    @Autowired
    ReviewService reviewServiceimpl;
    @Autowired
    RentalinfoMapper rentalinfoMapper;
    @Autowired
    OrderMapper orderMapper;


    @RequestMapping("createOrder")
    @ApiOperation("用户请求创建订单")
    public String createOrder(Integer rtlf_Id,String time,Integer during,Model model, HttpServletRequest httpServletRequest) throws Exception {
        //通过用户创建订单
           Userinfo userinfo = (Userinfo) httpServletRequest.getAttribute("user");

        //检测session 里是否存在 user ,若是有则可创建订单,若是没有则跳转登录界面
            if(userinfo!=null ){
                return "redirect:Login";//跳转登录
            }
        //创建订单需要获取 当前 页面显示的  房屋出租信息  出租房屋主键 户主主键
            if (rtlf_Id!=null){
                Order order = (Order) ordermanagementServiceimpl.transfer(userinfo.getUifId(),rtlf_Id,time,during);
                model.addAttribute("order",order);
            }
        //对条件进行判断
        //转调 alipay

        return "redirect:alipay";        //输入数据库
}

    @ApiOperation("用户订单查询展示")
    @RequestMapping("showOrder")
    public Result showOrder(HttpServletRequest httpServletRequest){
        //用户展示订单
        Userinfo userinfo = (Userinfo) httpServletRequest.getSession().getAttribute("user");
        String username = userinfo.getUifNickname();
        String json = ordermanagementServiceimpl.getAllOrderByUsername(username);
        return Result.ok().data("orderList",json);
    }

    @ApiOperation("用户订单取消并删除")
    @RequestMapping("delOrder")
    public Result delOrder(Integer od_Id){
        // 用户取消订单,并删除记录
        ordermanagementServiceimpl.deleteOrderByOd_Id(od_Id);
        return Result.ok();
    }


    @ApiOperation("评论订单")
    @RequestMapping("OrderReview")
    public Result orderReview(Integer od_Id,HttpServletRequest httpServletRequest, Review review){
        Userinfo userinfo = (Userinfo) httpServletRequest.getSession().getAttribute("user");
        Integer id = userinfo.getUifId();
        //评论订单,并添加到数据库
        Integer status = ordermanagementServiceimpl.showStatus(od_Id);

        if (status == 1){//确认 订单状态为已支付已确认
            reviewServiceimpl.review(review,id);
        }
        return Result.ok();
    }


    @ApiOperation("订单展示给房东")
    @RequestMapping("showOrderToH")
    public Result showOrderToH(HttpServletRequest httpServletRequest){
        //房东订单展示
        OrderExample oexample = new OrderExample();
        ArrayList<Integer> od = new ArrayList<>();
        Householdinfo household = (Householdinfo) httpServletRequest.getSession().getAttribute("household");
        Integer id = household.getHhifId();
        //房东编号获取相对应的房屋编号
        RentalinfoExample example = new RentalinfoExample();
        example.createCriteria().andRtlfHhidEqualTo(id);
        ArrayList<Rentalinfo> rentalinfos = (ArrayList<Rentalinfo>) rentalinfoMapper.selectByExample( example);
        for (Rentalinfo r:rentalinfos) {
            Integer od_id = r.getRtlfId();
            od.add(od_id);
        }
        oexample.createCriteria().andHsIdIn(od);

        List<Order> orders = orderMapper.selectByExample(oexample);
        Collections.sort(orders);
        return Result.ok().data("orderToH",orders);
    }


    @ApiOperation("房东拒接订单")
    @RequestMapping("rejectOrder")
    public Result rejectOrder(Integer odId){
        //房东订单拒接
        changeStatus(odId,3);//退订中
        return Result.ok();
    }

    @ApiOperation("房东接受订单")
    @RequestMapping("acceptOrder")
    public Result acceptOrder(Integer odId){
        //房东订单接受
        changeStatus(odId,2);//已确定
        return Result.ok();
    }

    public Result changeStatus(Integer odId,Integer status){
        //修改订单状态
        Order order = orderMapper.selectByPrimaryKey(odId);
        order.setOdStatus(status);
        orderMapper.updateByPrimaryKeySelective(order);

        return Result.ok();
    }




}
