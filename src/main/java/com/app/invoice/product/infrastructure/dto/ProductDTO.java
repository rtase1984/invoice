package com.app.invoice.product.infrastructure.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductDTO {
    private Long id;
    private String name;
    private Double unitPrice;
    private String description;
    private String category;
    private String image;
    private String qrCodeUrl;
    private byte[] qrCodeImage;
}
