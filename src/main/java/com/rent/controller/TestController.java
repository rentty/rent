package com.rent.controller;

import com.rent.bean.*;
import com.rent.mapper.ExpandMapper;
import com.rent.service.House_managementService;
import com.rent.service.UsermanagementService;
import io.swagger.annotations.Api;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Api(tags = "TestController", description = "hehe1管理")
public class    TestController {
    @Autowired
    ExpandMapper expandMapper;
    @GetMapping("/tests")
    @ResponseBody
    public  List<HouseExpand> tests(String username)
    {
        return   expandMapper.getHouseByRgt_Id(16);

    }
  @Autowired
    UsermanagementService usermanagementService;
  @GetMapping("/Motify_userinfo")
  @ResponseBody
  public String Motify_userinfo(Userinfo userinfo, String username)
  {

      String s = usermanagementService.Motify_userinfo(userinfo, username);

      return s;
  }
    @GetMapping("/getUserinfo")
    @ResponseBody
    public String getUserinfo(String username)
    {

        String userinfo1 = usermanagementService.getUserinfo(username);

        return userinfo1;
    }
    @GetMapping("/Entry_householdinfo")
    @ResponseBody
    public String Entry_householdinfo( Householdinfo householdinfo,String username)
    {

         usermanagementService.Entry_householdinfo(householdinfo,username);

        return "ok";
    }
    @GetMapping("/Motify_householdinfo")
    @ResponseBody
    public String Motify_householdinfo( Householdinfo householdinfo,String username)
    {

        String s = usermanagementService.Motify_householdinfo(householdinfo, username);
        System.out.println(s);
        return s;
    }
    @GetMapping("/getHouseholdinfoByUsername")
    @ResponseBody
    public String getHouseholdinfoByUsername(String username)
    {

        String s = usermanagementService.getHouseholdinfoByUsername(username);
        System.out.println(s);
        return s;
    }
    @GetMapping("/EntryFavorites")
    @ResponseBody
    public String EntryFavorites(int hs_id,String username)
    {

     usermanagementService.EntryFavorites(hs_id,username);

        return "ok";
    }
    @GetMapping("/getAllFavorites")
    @ResponseBody
    public String getAllFavorites(String username)
    {

        String allFavorites = usermanagementService.getAllFavorites(username);

        return allFavorites;
    }
    @GetMapping("/deleteFavoritesByFvr_Id")
    @ResponseBody
    public String deleteFavoritesByFvr_Id(int fid)
    {

        String s = usermanagementService.deleteFavoritesByFvr_Id(fid);

        return s;
    }

    @Autowired
    House_managementService house_managementService;
/*  @GetMapping("/entryRent_house")
  @ResponseBody
  public void entryRent_house(House house,String username)
  {
      house_managementService.entryRent_house(house,username);
  }*/



}
