package com.amy.springbootmall.dao;

import com.amy.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
