package com.amy.springbootmall.service;

import com.amy.springbootmall.constant.ProductCategory;
import com.amy.springbootmall.dto.ProductRequest;
import com.amy.springbootmall.model.Product;

import java.util.List;


public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
