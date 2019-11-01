package com.rent.controller;

import com.rent.common.Result;
import com.rent.service.House_managementService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Api(tags = "ShowHouse", description = "房屋管理")
@RequestMapping("/showHouse")
public class ShowHouseController {

    @Autowired
    House_managementService house_managementService;

    @ApiOperation(value = "获取房屋信息")
    @GetMapping("/showSingle")
    @ResponseBody
    public Result getHouses() {
        return Result.ok().data("houses",house_managementService.showHousesByRent());
    }

}
