package com.rent.controller;

import com.rent.bean.*;
import com.rent.mapper.ExpandMapper;
import com.rent.service.House_managementService;
import com.rent.service.OrdermanagementService;
import com.rent.service.ReviewService;
import com.rent.service.UsermanagementService;
import io.swagger.annotations.Api;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@Api(tags = "TestController", description = "hehe1管理")
public class    TestController {
    @Autowired
    ExpandMapper expandMapper;
    @GetMapping("/tests")
    @ResponseBody
    public  Date tests(String username)
    {
        Date date = new Date();
        return   date;

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
OrdermanagementService ordermanagementService;
    @GetMapping("/EntryOrder")
    @ResponseBody
    public String EntryOrder(Order order,String username)
    {

        ordermanagementService.EntryOrder(order,username);
        return "ok";
    }

    @GetMapping("/getAllOrderByUsername")
    @ResponseBody
    public String getAllOrderByUsername(String username)
    {

        String allOrderByUsername = ordermanagementService.getAllOrderByUsername(username);
        return allOrderByUsername;
    }

    @GetMapping("/MotifyOrderStatus")
    @ResponseBody
    public String MotifyOrderStatus(int od_Status,int od_Id)
    {
        String s = ordermanagementService.MotifyOrderStatus(od_Status, od_Id);
        return s;

    }

    @GetMapping("/deleteOrderByOd_Id")
    @ResponseBody
    public String deleteOrderByOd_Id(int od_Id)
    {
       ordermanagementService.deleteOrderByOd_Id(od_Id);
        return "ok";

    }
    @Autowired
    ReviewService reviewService;
    @GetMapping("/review")
    @ResponseBody
    public String review(Review review,String username)
    {
        reviewService.review(review,username);
        return "ok";

    }
    @GetMapping("/getAllReviewByHs_Id")
    @ResponseBody
    public String getAllReviewByHs_Id(int hs_Id)
    {
        String allReviewByHs_id = reviewService.getAllReviewByHs_Id(hs_Id);
        return allReviewByHs_id;

    }

}
