package com.rent.service;

import com.rent.bean.Order;

import java.util.List;

public interface OrdermanagementService {
    /**
     * 订单录入
     * @param order
     * @param username 获取用户id
     *
     */
    public void EntryOrder(Order order,String username);

    /**
     * 修改订单状态
     * @param od_Status
     * @param od_Id 订单编号
     */
    public String MotifyOrderStatus(int od_Status,int od_Id);

    /**
     * 查找用户所有订单--------------将list也装换json?????????????-------------------------------------------
     * @param username 获取用户编号
     * @return json-----List
     */
    public String getAllOrderByUsername(String username);

    /**
     * 删除订单
     * @param od_Id
     */
    public String deleteOrderByOd_Id(int od_Id);
}
