package com.rent.controller;

import com.rent.bean.Sysuser;
import com.rent.common.Result;
import com.rent.service.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("login")
    @ApiOperation(value = "用户登录")
    public Result login(@ApiParam(name = "sysuser", value = "系统用户对象", required = true)
                            @RequestBody Sysuser sysuser){

        System.out.println(sysuser);
        int num = sysUserService.login(sysuser);
        if(num == 1)
            return Result.ok().data("token","admin");
        else if(num == 0)
            return Result.loginfail();
        else
            return Result.notadmin();

    }
    @GetMapping("info")
    @ApiOperation(value = "获取用户信息")
    public Result info( @ApiParam(name = "token", value = "令牌", required = true)
                            @RequestParam String token){
        return Result.ok()
                .data("roles", "admin")
                .data("name", "admin")
                .data("avatar", "https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
    }
    @ApiOperation(value = "用户登出")
    @PostMapping("logout")
    public Result logout(){
        return Result.ok();
    }
}
