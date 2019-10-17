package com.rent.controller;

import com.rent.bean.Householdinfo;
import com.rent.common.Result;
import com.rent.serviceImpl.HouseholdinfoServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Api(tags = "Householdinfo", description = "户主管理")
public class HouseholdinfoController {
    @Autowired
    HouseholdinfoServiceImpl householdinfoService;

    /**
     * 用户类型更改为户主类型（新增户主）
     */
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

    /**
     * 修改
     */
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

    /**
     * 删除
     */
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

    /**
     * 查询所有户主
     *
     * @return list<Householdinfo>
     */
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

    /**
     * 根据id查找
     *
     * @return Householdinfo
     */
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

    /**
     * 更改审核信息
     */
    @GetMapping("/householdinfo/updateStatus")
    @ResponseBody
    @ApiOperation("更改审核信息")
    public Result changeStatus(int hhifId, int status) {
        if(householdinfoService.changeStatus(hhifId,status) != 1){
            return Result.error();
        }else {
            return Result.ok();
        }
    }
}
