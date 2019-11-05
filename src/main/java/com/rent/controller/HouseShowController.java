package com.rent.controller;

import com.rent.common.Result;
import com.rent.service.House_managementService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@Api(tags = "HouseShow", description = "房屋展示")
@RequestMapping("/HouseShow")
public class HouseShowController {

    @Autowired
    House_managementService house_managementService;

    @ApiOperation(value = "获取房屋信息")
    @GetMapping("/showSingle")
    @ResponseBody
    public Result getHouses() {
        return Result.ok().data("houses",house_managementService.showHousesByRent());
    }

    @ApiOperation(value = "获取房屋详细信息")
    @GetMapping("/showDetail")
    @ResponseBody
    public Result getHouseDetail(Integer id) {
        return Result.ok().data("housedetail",house_managementService.showHouseDetail(id));
    }

    @ApiOperation(value = "查询房屋")
    @GetMapping("/query")
    @ResponseBody
    public Result queryHouses(@RequestParam(value = "keyword", required = false) String keyword, @RequestParam(value = "a", required = false) String district, @RequestParam(value = "b", required = false) String type, @RequestParam(value = "c", required = false) String rent) {
        List<String> list = new ArrayList<String>();

        if(district != null && !StringUtils.isBlank(district)) {
            list.add(district);
        }

        if(type != null && !StringUtils.isBlank(type)) {
            list.add(type);
        }

        if(rent != null && !StringUtils.isBlank(rent)) {
            list.add(rent);
        }

        return Result.ok().data("houses", house_managementService.searchEntity(keyword,list));
    }

    @ApiOperation(value = "获取筛选栏目和条件")
    @GetMapping("/showValue")
    @ResponseBody
    public Result getValues(@RequestParam(value="city", required = false, defaultValue = "广州") String city) {
        return Result.ok().data("dialogs",house_managementService.getSearchCondition()).data("entrydls",house_managementService.getSearchValue(city));
    }

}
