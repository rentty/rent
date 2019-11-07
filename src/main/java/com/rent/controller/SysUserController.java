package com.rent.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.rent.bean.House;
import com.rent.bean.Housedl;
import com.rent.bean.Sysuser;
import com.rent.bean.Userinfo;
import com.rent.common.Result;
import com.rent.service.SysUserService;
import com.rent.service.impl.House_managementServiceImpl;
import com.rent.service.impl.OrdermanagementServiceImpl;
import com.rent.service.impl.ReviewServiceImpl;
import com.rent.service.impl.UsermanagementServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author BABA
 * @date 2019/10/16 9:15
 */
@Api(description = "系统用户管理")
@RestController
@CrossOrigin
@RequestMapping("/admin/sysuser")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @Autowired
    House_managementServiceImpl house_managementService;

    @Autowired
    ReviewServiceImpl reviewService;

    @Autowired
    UsermanagementServiceImpl usermanagementService;

    @Autowired
    OrdermanagementServiceImpl ordermanagementService;
    @PostMapping("login")
    @ApiOperation(value = "系统管理员登录")
    public Result login(@ApiParam(name = "sysuser", value = "系统用户对象", required = true)
                            @RequestBody Sysuser sysuser, HttpServletRequest httpServletRequest){

        System.out.println(sysuser);

        int num = sysUserService.login(sysuser);
        if(num == 1)
            return Result.ok().data("token",sysuser.getUsername());
        else if(num == 0)
            return Result.loginfail();
        else
            return Result.notadmin();

    }
    @GetMapping("info")
    @ApiOperation(value = "获取用户信息")
    public Result info( @ApiParam(name = "token", value = "令牌", required = true)
                            @RequestParam String token){
        String username = token;
        Userinfo userinfo = sysUserService.info(username);
        return Result.ok()
                .data("roles", "admin")
                .data("name", userinfo.getUifNickname())
                .data("avatar", "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
    }
    @ApiOperation(value = "用户登出")
    @PostMapping("logout")
    public Result logout(){
        return Result.ok();
    }

    @ApiOperation(value = "房屋所有信息查询")
    @GetMapping("/getAllHouseMsg/{pn}")
    @ResponseBody
    public Result getAllHouseMsg(@PathVariable() int pn){
        PageHelper.startPage(pn, 10);
        List<House> houseList = house_managementService.findAllHouse();
        List<Housedl> housedlList = house_managementService.findAllHousedl();
        PageInfo page = new PageInfo(houseList,5);
        return Result.ok().data("page",page);
    }//data("house",houseList).data("housedl",housedlList).

    @ApiOperation(value = "修改房屋审核状态")
    @GetMapping("/changeStatus")
    @ResponseBody
    public Result changeStatus(int id,int status){
        if(house_managementService.changeStatus(id,status) != 1 || house_managementService.addHouseToEs(id) != 1){
            return Result.error();
        }else {
            return Result.ok();
        }
    }

    @ApiOperation(value = "获取所有出租信息")
    @GetMapping("/getAllRentalinfo")
    @ResponseBody
    public Result getAllRentalinfo(){
        return Result.ok().data("rentalinfo",house_managementService.findAllRentalinfo());
    }

    @ApiOperation(value = "获取所有出租信息ById")
    @GetMapping("/getAllRentalinfoById")
    @ResponseBody
    public Result getAllRentalinfo(int id){
        return Result.ok().data("rentalinfo",house_managementService.findAllRentalinfoById(id));
    }

    @ApiOperation(value = "获取所有评论信息")
    @GetMapping("/getAllReview")
    @ResponseBody
    public Result getAllReview(){
        return Result.ok().data("Review",reviewService.findAllReview());
    }

    @ApiOperation(value = "删除评论信息")
    @GetMapping("/deleteReview")
    @ResponseBody
    public Result deleteReview(int id){
        if(reviewService.deleteReview(id) != 1){
           return Result.error();
        }else {
           return Result.ok();
        }
    }

    @ApiOperation(value = "获取所有用户信息")
    @GetMapping("/getAllUser")
    @ResponseBody
    public Result getAllUser(){
        return Result.ok().data("user",usermanagementService.findAllUserinfo()).data(
                "userinfo",usermanagementService.findAllUserinfo()
        );
    }

    @ApiOperation(value = "获取所有订单信息")
    @GetMapping("/getAllOrder")
    @ResponseBody
    public Result getAllOrder(){
        return Result.ok().data("order",ordermanagementService.findAllOrder());
    }

    @ApiOperation(value = "获取所有带条目的目录信息")
    @GetMapping("/getDioAndEdl")
    @ResponseBody
    public Result getDioAndEdl(){
        return Result.ok().data("DioAndEdl",sysUserService.getDialogWithEdtrydl());
    }

    @ApiOperation(value = "获取所有带收藏的用户信息")
    @GetMapping("/getAllUserWithFavor")
    @ResponseBody
    public Result getAllUserWithFavor(){
        return Result.ok().data("UserWithFavor",sysUserService.findAllUserWithFavor());
    }
    
}
