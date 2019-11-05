package com.rent.controller;


import com.rent.bean.Housedl;
import com.rent.bean.showHousedl;
import com.rent.common.Result;
import com.rent.service.impl.showHousedlM;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Api("房屋展示")
@RestController
public class HouseShowController {
    @Autowired
    showHousedlM showHouM;

    @ApiOperation(value = "获取房屋页详情信息")
    @GetMapping("/getHouseDetail")
    public Result getHouseDetail(Integer hsId){

        showHousedl byhsId = showHouM.getByhsId(hsId);

        return Result.ok().data("showHousedl",byhsId);
    }

    @ApiOperation(value = "获取房屋图片地址")
    @GetMapping("/getHousePic")
    public Result getHousePic(Integer hsId){

        Housedl byhsId = showHouM.getPicbyhsId(hsId);

        return Result.ok().data("Housedl",byhsId);
    }

}
