package com.amy.springbootmall.service;

import com.amy.springbootmall.dto.CreateOrderRequest;
import com.amy.springbootmall.dto.OrderQueryParams;
import com.amy.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);


}
