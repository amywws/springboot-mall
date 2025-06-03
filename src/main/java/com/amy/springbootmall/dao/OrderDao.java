package com.amy.springbootmall.dao;

import com.amy.springbootmall.model.Order;
import com.amy.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOderItems(Integer orderId, List<OrderItem> orderItemList);
}
