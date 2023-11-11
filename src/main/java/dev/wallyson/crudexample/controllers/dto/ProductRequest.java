package dev.wallyson.crudexample.controllers.dto;

import dev.wallyson.crudexample.entities.Product;

public class ProductRequest {
    private String name;

    private Long quantity;

    private Double price;

    public Product toDomain() {
        return new Product(this.name, this.quantity, this.price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
