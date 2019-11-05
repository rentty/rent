package com.rent.controller;

import com.rent.bean.House;
import com.rent.bean.Housedl;
import com.rent.bean.Householdinfo;
import com.rent.bean.Rentalinfo;
import com.rent.common.Result;
import com.rent.service.House_managementService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@Controller
@Api(tags = "Householdinfo", description = "户主管理")
@RequestMapping("/householdinfo")
public class HouseholdinfoController {

    @Autowired
    House_managementService house_managementService;

    /*@Autowired
    HouseholdinfoServiceImpl householdinfoService;

    *//**
     * 用户类型更改为户主类型（新增户主）
     *//*
    @GetMapping("/householdinfo/insert")
    @ResponseBody
    @ApiOperation("新增户主信息")
    public Result createHouseHoldInfo(Householdinfo householdinfo) {
        int i = householdinfoService.createHouseHoldInfo(householdinfo);
        //System.out.println(i);
        if( i!= 1){
            return Result.error();
        }else{
            return Result.ok();
        }
    }

    *//**
     * 修改
     *//*
    @GetMapping("/householdinfo/update")
    @ResponseBody
    @ApiOperation("修改户主信息")
    public Result updateHouseHoldInfo(Householdinfo householdinfo) {
        if(householdinfoService.updateHouseHoldInfo(householdinfo) != 1){
            return Result.error();
        }else{
            return Result.ok();
        }

    }

    *//**
     * 删除
     *//*
    @GetMapping("/householdinfo/delete")
    @ResponseBody
    @ApiOperation("删除户主信息")
    public Result deleteHouseHoldInfo(int uifId) {
        if(householdinfoService.deleteHouseHoldInfo(uifId) != 1){
            return Result.error();
        }else{
            return Result.ok();
        }

    }

    *//**
     * 查询所有户主
     *
     * @return list<Householdinfo>
     *//*
    @GetMapping("/householdinfo/findAll")
    @ResponseBody
    @ApiOperation("查询所有户主")
    public Result findAll() {
        List<Householdinfo> list = householdinfoService.findAll();
        if(list != null){
            return Result.ok().data("HouseholdinfoList",list);
        }else {
            return Result.error();
        }

    }

    *//**
     * 根据id查找
     *
     * @return Householdinfo
     *//*
    @GetMapping("/householdinfo/findById")
    @ResponseBody
    @ApiOperation("根据id查找户主信息")
    public Result findById(int hhifId) {
        Householdinfo householdinfo = householdinfoService.findById(hhifId);
        if(householdinfo != null){
            return Result.ok().data("householdinfo",householdinfo);
        }else {
            return Result.error();
        }
    }

    *//**
     * 更改审核信息
     *//*
    @GetMapping("/householdinfo/updateStatus")
    @ResponseBody
    @ApiOperation("更改审核信息")
    public Result changeStatus(int hhifId, int status) {
        if(householdinfoService.changeStatus(hhifId,status) != 1){
            return Result.error();
        }else {
            return Result.ok();
        }
    }*/

    @ApiOperation(value = "删除房屋信息")
    @DeleteMapping("/deleteHouse")
    @ResponseBody
    public Result deleteHouse(int id) {
        if(house_managementService.deleteHouse(id) != 1){
            return Result.error();
        }else {
            return Result.ok();
        }
    }

    @ApiOperation(value = "修改房屋信息")
    @PutMapping("/updateHouse")
    @ResponseBody
    public Result changeHouse(House house, Housedl housedl, Rentalinfo rentalinfo) {
        if(house_managementService.updateHouse(house,housedl,rentalinfo) != 1){
            return Result.error();
        }else {
            return Result.ok();
        }
    }

    @ApiOperation(value = "添加房屋信息")
    @PostMapping("/addHouse")
    @ResponseBody
    public Result addHouse(House house, Housedl housedl, Rentalinfo rentalinfo, String username) {
        System.out.println(house);
        System.out.println(housedl);
        System.out.println(rentalinfo);
        if(house_managementService.entryHouse(house,housedl,rentalinfo,username) != 1){
            return Result.error();
        }else {
            return Result.ok();
        }
    }

    @ApiOperation(value = "查询房屋信息")
    @GetMapping("/getHouse")
    @ResponseBody
    public Result getHouse(int id, HttpResponse response) {
        /*response.setHeader("Access-Control-Allow-Origin", "*");*/
        return Result.ok().data("houseList",house_managementService.getAllHouseAndRentById(id));
    }
}
