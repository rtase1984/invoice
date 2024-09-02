package com.app.invoice.domain.model;

import lombok.Data;

@Data
public class Invoice {
    private Long id;
    private String invoiceNumber;
    private String invoiceDate;
    private String dueDate;
    private String totalAmount;
    private String paymentStatus;
    private String qrCode;

}
