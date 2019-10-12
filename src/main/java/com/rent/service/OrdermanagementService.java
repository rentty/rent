package com.rent.service;

import com.rent.bean.Order;

import java.util.List;

public interface OrdermanagementService {
    /**
     * 订单录入
     * @param order
     */
    public void EntryOrder(Order order);

    /**
     * 修改订单状态
     * @param od_Status
     */
    public void MotifyOrderStatus(int od_Status);

    /**
     * 查找用户所有订单--------------将list也装换json?????????????-------------------------------------------
     * @param uif_Id
     * @return json-----List
     */
    public String getAllOrderByUif_Id(int uif_Id);

    /**
     * 删除订单
     * @param od_Id
     */
    public void deleteOrderByOd_Id(int od_Id);
}
