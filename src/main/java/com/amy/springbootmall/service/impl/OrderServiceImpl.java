package com.amy.springbootmall.service.impl;

import com.amy.springbootmall.dao.OrderDao;
import com.amy.springbootmall.dao.ProductDao;
import com.amy.springbootmall.dto.BuyItem;
import com.amy.springbootmall.dto.CreateOrderRequest;
import com.amy.springbootmall.model.Order;
import com.amy.springbootmall.model.OrderItem;
import com.amy.springbootmall.model.Product;
import com.amy.springbootmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Component
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;
    @Autowired
    private ProductDao productDao;

    @Override
    public Order getOrderById(Integer orderId) {
        Order order = orderDao.getOrderById(orderId);

        List<OrderItem> orderItemList = orderDao.getOrderItemsByOrderId(orderId);

        order.setOrderItemList(orderItemList);
        return order;
    }

    @Transactional
    @Override
    public Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest) {
        Integer totalAmount = 0;
        List<OrderItem> orderItemList = new ArrayList<>();

        for (BuyItem buyItem : createOrderRequest.getBuyItemList()){
            Product product = productDao.getProductById(buyItem.getProductId());

            //計算總價錢
            int amount = product.getPrice()*buyItem.getQuantity();
            totalAmount += amount;

            //轉換BuyItem to OrderItem
            OrderItem orderItem = new OrderItem();
            orderItem.setProductId(buyItem.getProductId());
            orderItem.setQuantity(buyItem.getQuantity());
            orderItem.setAmount(amount);
            orderItemList.add(orderItem);
        }

          //創建訂單
        Integer orderId = orderDao.createOrder(userId, totalAmount);

        orderDao.createOderItems(orderId, orderItemList);
        return orderId;

    }
}
