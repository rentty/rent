package com.rent.controller;


import com.rent.bean.Order;
import com.rent.bean.Userinfo;
import com.rent.common.Result;
import com.rent.service.OrdermanagementService;
import com.rent.service.OrdermanagementServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Api("订单控制")
@RestController
public class OrderController {

    @Autowired
    OrdermanagementService ordermanagementServiceimpl;

    @RequestMapping("createOrder")
    @ApiOperation("用户请求创建订单")
    public String createOrder(String rtlf_Id, Model model, HttpServletRequest httpServletRequest){
        //通过用户创建订单
           Userinfo userinfo = (Userinfo) httpServletRequest.getAttribute("user");

        //检测session 里是否存在 user ,若是有则可创建订单,若是没有则跳转登录界面
            if(userinfo!=null ){
                return "redirect:Login";//跳转登录
            }
        //创建订单需要获取 当前 页面显示的  房屋出租信息  出租房屋主键 户主主键
            if (rtlf_Id!=null){
                Order order = (Order)OrdermanagementServiceImpl.transfer(userinfo.getUifId(),rtlf_Id);
                model.addAttribute("order",order);
            }
        //对条件进行判断
        //转调 alipay

        return "redirect:alipay";        //输入数据库
}

    public Result showOrder(){
        //用户展示订单

        return Result.ok();
    }


    public Result delOrder(){
        // 用户取消订单,并删除记录


        return Result.ok();
    }



    public Result orderReview(){
        //评论订单,并添加到数据库
        return Result.ok();
    }


    public Result showOrderTo(){
        //房东订单展示
        return Result.ok();
    }

    public Result cancelOrder(){
        //房东订单拒接
        return Result.ok();
    }
    public Result changeStatus(){
        //修改订单状态


        return Result.ok();
    }




}
