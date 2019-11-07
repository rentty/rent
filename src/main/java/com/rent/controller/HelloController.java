package com.rent.controller;

import com.rent.bean.Dialog;
import com.rent.bean.Userinfo;
import com.rent.common.Result;
import com.rent.service.FastDFSClientUtil;
import com.rent.service.HelloService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@Api("房屋展示")
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hehe")
    @ResponseBody
    @ApiOperation("swagger测试")
    public String hello(@ApiParam("搜索目录图")Dialog dialog)  {

        return "hello world";
    }
    @GetMapping("/userInfo")
    @ResponseBody
    @ApiOperation("查询用户信息")
    public List<Userinfo> selectAll()  {
        List<Userinfo> userinfos = helloService.selectAll();

        return userinfos;
    }
    @Autowired
    FastDFSClientUtil dfsClient;
    @PostMapping("/upload")
    public Result fdfsUpload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
       // System.out.println("*****");
        try {
            String fileUrl = dfsClient.uploadFile(file);
            System.out.println(fileUrl);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Result.ok();
    }
    @ApiOperation(value = "ces")
    @GetMapping("/testss1111111")
    @ResponseBody
    public String testss(String username)
    {
     return helloService.testss(username);
    }

}
