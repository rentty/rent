package com.rent.controller;

import com.rent.bean.MapHouse;
import com.rent.bean.Registy;
import com.rent.bean.ShowHouse;
import com.rent.bean.Userinfo;
import com.rent.common.Result;
import com.rent.service.UsermanagementService;
import com.rent.service.impl.House_managementServiceImpl;
import com.rent.service.impl.OrdermanagementServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@CrossOrigin//地图发请求用
@Api(description = "用户户主管理")
@RestController
@RequestMapping("/admin/user")
public class UserController {
    @Autowired
    UsermanagementService usermanagementService;

    @Autowired
    OrdermanagementServiceImpl ordermanagementService;

    @Autowired
    House_managementServiceImpl house_managementService;

    @ApiOperation(value = "用户注册")
    @GetMapping("/registy")
    @ResponseBody
    public Result registy(Registy registy, String Nickname){
        int num = usermanagementService.Register(registy,Nickname);
        if(num == -1){
            return Result.error().message("新增注册用户表错误！");
        }else if (num == -2){
            return Result.error().message("新增用户信息表错误！");
        }else if (num == 0){
            return Result.error().message("用户已存在！");
        }else {
            return Result.ok();
        }
    }

    @ApiOperation(value = "用户登录")
    @GetMapping("/login")
    @ResponseBody
    public Result login(String username, String pwd, HttpServletRequest httpServletRequest){
        HashMap map = usermanagementService.Login(username,pwd);
        //status:状态，11表示户主，12普通用户
        //user:用户信息
        int num = (int) map.get("status");
        if(num == -1){
            return Result.error().message("用户不存在");
        }else if(num == 0){
            return Result.error().message("密码错误");
        }else if(num == 11){
            httpServletRequest.getSession().setAttribute("userMap",map);
            return Result.ok().data("householdinfo",map);
        }else if(num == 12){
            httpServletRequest.getSession().setAttribute("userMap",map);
            return Result.ok().data("user",map);
        }else {
            return Result.error();
        }
    }

    @ApiOperation(value = "根据用户/户主和订单状态查订单")
    @GetMapping("/getOrder")
    @ResponseBody
    public Result registy(int id,int who, int status){//status,-1:不限订单状态;who:1:户主,2:用户
        return Result.ok().data("orderList",ordermanagementService.getAllOrderByUserId(id,who,status));
    }

    @ApiOperation(value = "根据用户id返回用户信息")
    @GetMapping("/getUserById")
    @ResponseBody
    public Result getUserById(int id){

            return Result.ok().data("user",usermanagementService.getUserinfo(id));

    }

    @ApiOperation(value = "根据用户id修改信息")
    @GetMapping("/updateById")
    @ResponseBody
    public Result updateById(Userinfo userinfo,HttpServletRequest httpServletRequest){
        if(usermanagementService.Motify_userinfo(userinfo) > 0){
            httpServletRequest.getSession().setAttribute("user",userinfo);
            return Result.ok();
        }else {
            return Result.error();
        }
    }

    @ApiOperation(value = "根据用户id返回收藏的房屋展示对象")
    @GetMapping("/getAllFavorHouse")
    @ResponseBody
    public Result getAllFavorHouse(int id){
        List<ShowHouse> allFavorites = usermanagementService.getAllFavorites(id);
        return Result.ok().data("showHouseList",allFavorites);
    }

    @ApiOperation(value = "根据收藏夹id删除收藏")
    @GetMapping("/deleteFavor")
    @ResponseBody
    public Result deleteFavor(int id){
        if(usermanagementService.deleteFavoritesByFvr_Id(id) > 0){
            return Result.ok();
        }else {
            return Result.error();
        }
    }

    @ApiOperation(value = "查询所有带评论的房屋信息")
    @GetMapping("/getAllHouseWithReview")
    @ResponseBody
    public Result getAllHouseWithReview(){
        return Result.ok().data("houseWithReview",house_managementService.findAllHouseWithReview());
    }

    @ApiOperation(value = "收藏房屋")
    @GetMapping("/EntryFavorites")
    @ResponseBody
    public Result EntryFavorites(int hs_Id,int uif_Id){
        int num = usermanagementService.EntryFavorites(hs_Id,uif_Id);
        if(num == 1){
            return Result.ok();
        }else if(num < 0){
            return Result.error().message("此房屋已被收藏");
        }else {
            return Result.error();
        }
    }

    @ApiOperation(value = "地图请求返回房屋和出租信息")
    @PostMapping("/getMapHouseAndRent")
    @ResponseBody
    public Result getMapHouseAndRent(String type,String ori,int area1,int area2,int layer1,int layer2,
                                     int rent1,int rent2){
        //System.out.println(type);
        List<MapHouse> list = usermanagementService.findAllHouseAndRent(type,ori,area1,area2,layer1,layer2,rent1,rent2);

        return Result.ok().data("MapHouse",list).data("number",usermanagementService.countHouse(list));
        /*return Result.ok();*/
    }

    @ApiOperation(value = "从地图添加房屋数据")
    @PostMapping("/mapDataTest")
    @ResponseBody
    public Result mapDataTest(String address,String lng,String lat){
        //System.out.println(address + lng+ ","+lat);

        if( usermanagementService.dataToMap(address,lng,lat) >0){
            System.out.println("1");
        }
        return Result.ok();
    }
}
