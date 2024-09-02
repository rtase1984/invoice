package com.app.invoice.domain.model;

import lombok.Data;

@Data
public class Product {
    private Long id;
    private String name;
    private Double price;
    private Integer quantity;
    private String description;
    private String category;
    private String image;
    private String qrCode;

}
