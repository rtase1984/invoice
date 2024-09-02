package com.app.invoice.domain.model;

import lombok.Data;

@Data
public class InvoiceDetail {
    private Long id;
    private Long invoiceId;
    private Long productId;
    private Integer quantity;
    private Double subtotalPrice;
}
