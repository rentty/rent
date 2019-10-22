package com.rent.service;

import com.rent.bean.Order;
import org.mockito.internal.matchers.Or;

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
     * @return
     */
    public List<Order> getAllOrderByUserId(int id,int who,int status);

    /**
     * 删除订单
     * @param od_Id
     */
    public String deleteOrderByOd_Id(int od_Id);

    /**
     * 查找所有订单
     */
    public List<Order> findAllOrder();

    /**
     * 创建订单
     * @param uifId    用户id
     * @param rtlf_id  房屋id
     * @param time     预定时间
     * @param during   预定时长
     * @return  order  订单
     */
    public Order transfer(Integer uifId, Integer rtlf_id, String time, Integer during) throws Exception;

    /**
     *查询订单状态
     * @param od_Id
     * @return
     */
    public Integer showStatus(Integer od_Id);


    List<Order> getAllOrderByUsername(String username);
}
