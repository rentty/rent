package com.rent.service.impl;

import com.rent.bean.Order;
import com.rent.bean.OrderExample;
import com.rent.bean.Registy;
import com.rent.bean.Rentalinfo;
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

import java.util.Date;

@Service
@CacheConfig(cacheNames = "OrdermanagementService",cacheManager = "cacheManager")
public class OrdermanagementServiceImpl implements OrdermanagementService {
    @Autowired
    ExpandMapper expandMapper;
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    RegistyMapper registyMapper;
    @Autowired
    RentalinfoMapper rentalinfoMapper;
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

        orderMapper.insertSelective(order);
    }

    @Override
    @CacheEvict(key = "#result",value = "AllUserOrder")
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
    @Cacheable(key = "#username",value = "AllUserOrder")
    public String getAllOrderByUsername(String username) {
        int id=0;
        id = expandMapper.selectRgt_IdByUsername(username);
        OrderExample orderExample = new OrderExample();
        orderExample.createCriteria().andUifIdEqualTo(id);

        return JSonPool.toJSon(orderMapper.selectByExample(orderExample));
    }

    @Override
    @CacheEvict(key = "#result",value = "AllUserOrder")
    public String deleteOrderByOd_Id(int od_Id) {
        //获取用户账号
        Order order = orderMapper.selectByPrimaryKey(od_Id);
        Registy registy = registyMapper.selectByPrimaryKey(order.getUifId());
        orderMapper.deleteByPrimaryKey(od_Id);

        return registy.getRgtUser();

    }
}
