package com.rent.service.impl;

import com.alibaba.fastjson.JSON;
import com.rent.bean.*;
import com.rent.common.StringToDate;
import com.rent.mapper.ExpandMapper;
import com.rent.mapper.OrderMapper;
import com.rent.mapper.RegistyMapper;
import com.rent.mapper.RentalinfoMapper;
import com.rent.service.JSonPool;
import com.rent.service.OrdermanagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
//@CacheConfig(cacheNames = "OrdermanagementService",cacheManager = "cacheManager")
public class OrdermanagementServiceImpl implements OrdermanagementService {
    @Autowired
    ExpandMapper expandMapper;
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    RegistyMapper registyMapper;
    @Autowired
    RentalinfoMapper rentalinfoMapper;


    public Order transfer(Integer uif_Id,Integer rtlf_Id,String time,Integer during) throws Exception {

        Date now = new Date();

        Rentalinfo rentalinfo = rentalinfoMapper.selectByPrimaryKey(rtlf_Id);
        Integer hhid = rentalinfo.getRtlfHhid();
        //预定时间
        Date bookdate = StringToDate.toDate(time);
        Integer rent = rentalinfo.getRtlfRent()*during;

        Order order = new Order();
        order.setOdOrdertime(now);
        order.setUifId(uif_Id);
        order.setHhifId(hhid);
        order.setOdBooktime(bookdate);
        order.setHsId(rtlf_Id);
        order.setOdRent(rent);
        order.setOdStatus(0);
        //uif_Id
        //通过retalinfo 查询房屋编号,获取户主编号,
        int i = orderMapper.insertSelective(order);
        //生成订单需要 下单时间 od_ordertime  用户编号  户主编号 预定时间 租期时长  房屋编号  支付金额
        return order;
    }

    @Override
    public Integer showStatus(Integer od_Id) {

        Order order = orderMapper.selectByPrimaryKey(od_Id);

        return  order.getOdStatus();
    }

    @Override
    public String getAllOrderByUsername(String username) {
        RegistyExample registyExample = new RegistyExample();
        registyExample.createCriteria().andRgtUserEqualTo(username);
        Registy registy = (Registy) registyMapper.selectByExample(registyExample);
        Integer id = registy.getRgtId();

        OrderExample orderExample = new OrderExample();
        orderExample.createCriteria().andUifIdEqualTo(id);
        ArrayList<Order> order = (ArrayList<Order>) orderMapper.selectByExample(orderExample);

        return order.toString();
    }

    @Override
    public void EntryOrder(Order order, String username) {
        int id = 0;
        id = expandMapper.selectRgt_IdByUsername(username);
        Rentalinfo rentalinfo = rentalinfoMapper.selectByPrimaryKey(order.getHsId());//获取户主编号
        Date date = new Date();
        order.setOdOrdertime(date);
      //  order.setOdBooktime(date);//预订时间
        order.setHhifId(rentalinfo.getRtlfHhid());
        order.setUifId(id);
        order.setHsId(order.getHsId());
        order.setOdBooktime(date);
        order.setOdDuration(1);//错误
        order.getOdRent();
        orderMapper.insertSelective(order);
    }

    @Override
    //@CacheEvict(key = "#result",value = "AllUserOrder")
    public String MotifyOrderStatus(int od_Status, int od_Id) {
        Order order = new Order();
        order.setOdId(od_Id);
        order.setOdStatus(od_Status);
        orderMapper.updateByPrimaryKeySelective(order);
        //获取用户账号
         order = orderMapper.selectByPrimaryKey(od_Id);
        Registy registy = registyMapper.selectByPrimaryKey(order.getUifId());
        return registy.getRgtUser();


    }

    @Override
   // @Cacheable(key = "#username",value = "AllUserOrder")
    public List<Order> getAllOrderByUserId(int id,int who,int status) {
        OrderExample orderExample = new OrderExample();
        if(who == 1){
            orderExample.createCriteria().andUifIdEqualTo(id);
        }else {
            orderExample.createCriteria().andHhifIdEqualTo(id);
        }
        if(status != -1){
            orderExample.createCriteria().andOdStatusEqualTo(status);
        }
        List<Order> orders = orderMapper.selectByExample(orderExample);

        return orders;
    }

    @Override
    //@CacheEvict(key = "#result",value = "AllUserOrder")
    public String deleteOrderByOd_Id(int od_Id) {
        //获取用户账号
        Order order = orderMapper.selectByPrimaryKey(od_Id);
        Registy registy = registyMapper.selectByPrimaryKey(order.getUifId());
        orderMapper.deleteByPrimaryKey(od_Id);

        return registy.getRgtUser();

    }

    @Override
    public List<Order> findAllOrder() {

        return orderMapper.selectByExample(null);
    }
}
