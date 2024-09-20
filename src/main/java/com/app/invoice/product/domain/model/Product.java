package com.app.invoice.product.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Long id;
    private String name;
    private Double unitPrice;
    private String description;
    private String category;
    private String image;
    private String qrCode;

}
