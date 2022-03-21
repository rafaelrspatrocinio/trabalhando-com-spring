package com.conceitosspring.aula1.entities;

import lombok.Data;

@Data
public class Product {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private String imgUrl;

    public Product(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }
}