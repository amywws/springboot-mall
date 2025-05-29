package com.amy.springbootmall.dto;

import com.amy.springbootmall.constant.ProductCategory;
import jakarta.validation.constraints.NotNull;

public class ProductRequest {

    @NotNull
    private String productName;

    private String description;

    @NotNull
    private Integer price;

    @NotNull
    private Integer stock;

    @NotNull
    private String imageUrl;

    @NotNull
    private ProductCategory category;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }
}
