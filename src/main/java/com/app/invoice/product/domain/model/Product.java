package com.app.invoice.product.domain.model;

import java.util.List;

import com.app.invoice.invoice.domain.model.InvoiceDetail;

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
    private String qrCodeUrl;
    private byte[] qrCodeImge;
    private List<InvoiceDetail> invoiceDetails;

}
