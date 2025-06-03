package com.amy.springbootmall.dao;

import com.amy.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOderItems(Integer orderId, List<OrderItem> orderItemList);
}
