package com.rent.controller;


import com.rent.common.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Api("房屋展示")
@RestController
public class HouseShowController {

    @ApiOperation(value = "获取房屋页详情信息")
    @GetMapping("/getHouseDetail")
    public Result getHouseDetail(Integer hsId){





        return Result.ok();
    }

}
