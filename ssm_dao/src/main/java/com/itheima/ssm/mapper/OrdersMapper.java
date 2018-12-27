package com.itheima.ssm.mapper;

import com.itheima.ssm.pojo.Orders;

import java.util.List;

public interface OrdersMapper {

    List<Orders> queryOrdersList() throws Exception;

    void saveOrders(Orders orders) throws Exception;
}
