package com.amy.springbootmall.dao;

import com.amy.springbootmall.dto.OrderQueryParams;
import com.amy.springbootmall.model.Order;
import com.amy.springbootmall.model.OrderItem;

import java.util.List;

public interface OrderDao {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    List<OrderItem> getOrderItemsByOrderId(Integer orderId);

    Integer createOrder(Integer userId, Integer totalAmount);

    void createOderItems(Integer orderId, List<OrderItem> orderItemList);
}
