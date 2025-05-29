package com.amy.springbootmall.service;

import com.amy.springbootmall.dto.ProductRequest;
import com.amy.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
