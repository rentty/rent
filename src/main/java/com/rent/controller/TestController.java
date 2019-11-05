
package com.rent.controller;

import com.rent.bean.*;
import com.rent.mapper.ExpandMapper;
import com.rent.service.*;
import io.swagger.annotations.Api;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@Api(tags = "TestController", description = "hehe1管理")
public class    TestController {
    /*@Autowired
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
    public String getUserinfo(int id)
    {

       */
    /* String userinfo1 = usermanagementService.getUserinfo(id);*//*


        return "";
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

   */
/* @GetMapping("/getAllOrderByUsername")
    @ResponseBody
    public String getAllOrderByUsername(String username)
    {

        String allOrderByUsername = ordermanagementService.getAllOrderByUsername(username);
        return allOrderByUsername;
    }*//*


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
    public String review(Review review,Integer id)
    {
        reviewService.review(review,id);
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
*/
    @Autowired
    HelloService helloService;
    @GetMapping("/test")
    @ResponseBody
    public void test(int key,String username)
    {
        helloService.test(key,username);
    }
    @GetMapping("/alltest")
    @ResponseBody
    public void alltest()
    {
        helloService.alltest();
    }
    @GetMapping("/delete")
    @ResponseBody
    public void delete(int key,String value)
    {
        helloService.update(key,value);
    }
    @GetMapping("/testss")
    @ResponseBody
    public Object testss(String username)
    {
   /*     Userinfo userinfo = new Userinfo();
        userinfo.setUifAvatar("sdfsf");
        userinfo.setUifId(12);
        userinfo.setUifPhone("121212");

        Userinfo userinfo1 = new Userinfo();
        userinfo1.setUifAvatar("sdfsf1");
        userinfo1.setUifId(121);
        userinfo1.setUifPhone("1212121");
        List<Userinfo> list = new ArrayList<Userinfo>();
        list.add(userinfo);
        list.add(userinfo1);*/
   String result="[{title:'整租 · 水岸金桥苑 · 1居室',price:'2000元/月'},{title:'整租 · 水岸金桥苑 · 3居室',price:'3000元/月'},{title:'整租 · 水岸金桥苑 · 4居室',price:'5000元/月'},{title:'整租 · 水岸金桥苑 · 5居室',price:'2000元/月'},{title:'整租 · 水岸金桥苑 · 6居室',price:'3000元/月'},{title:'整租 · 水岸金桥苑 · 7居室',price:'5000元/月'},{title:'整租 · 水岸金桥苑 · 7居室',price:'8000元/月'}]";
       return JSonPool.toObject(result,Object.class);
        //return "ok";
    }
    @GetMapping("/tiaomu")
    @ResponseBody
    public Object tiaomu()
    {
        String result="[{title:'湛江',arr:[{addr:'http://www.baidu.com',texts:'霞山',id:1},{addr:'#',texts:'3',id:2},{addr:'#',texts:'霞山',id:3},{addr:'#',texts:'霞山',id:4},{addr:'#',texts:'霞山',id:5}]},{title:'广州',arr:[{addr:'#',texts:'2',id:6},{addr:'#',texts:'3',id:7}]},{title:'湛江',arr:[{addr:'#',texts:'霞山',id:8},{addr:'#',texts:'3',id:9}]}]" ;
        return JSonPool.toObject(result,Object.class);

    }
    @GetMapping("/updatagallery")
    @ResponseBody
    public Object updatagallery(int a,int b,int c)
    {
        System.out.println(a+"  "+b+"  "+c);
        String result="[{title:'整租 · 水岸金桥苑 · 2居室',price:'2000元/月'},{title:'整租 · 水岸金桥苑 · 3居室',price:'3000元/月'},{title:'整租 · 水岸金桥苑 · 4居室',price:'5000元/月'},{title:'整租 · 水岸金桥苑 · 5居室',price:'2000元/月'},{title:'整租 · 水岸金桥苑 · 6居室',price:'3000元/月'},{title:'整租 · 水岸金桥苑 · 7居室',price:'5000元/月'},{title:'整租 · 水岸金桥苑 · 7居室',price:'8000元/月'}]";
        return JSonPool.toObject(result,Object.class);

    }


}