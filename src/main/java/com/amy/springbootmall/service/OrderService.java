package com.amy.springbootmall.service;

import com.amy.springbootmall.dto.CreateOrderRequest;
import com.amy.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);


}
