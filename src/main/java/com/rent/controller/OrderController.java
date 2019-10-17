package com.rent.controller;


import io.swagger.annotations.Api;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Api("订单控制")
@RestController
public class OrderController {


    @RequestMapping("createOrder")
    public String createOrder(HttpServletRequest httpServletRequest){
        //通过用户创建订单
            httpServletRequest.getAttribute("user");
        //检测session 里是否存在 user ,若是有则可创建订单,若是没有则跳转登录界面
        //创建订单需要获取 当前 页面显示的  房屋出租信息  出租房屋主键 户主主键
        //对条件进行判断
        //转调 alipay
        //输入数据库
        return "redirect:alipay";
    }

    public String showOrder(){

    }

}
