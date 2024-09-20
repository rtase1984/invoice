package com.app.invoice.invoice.domain.model;

import java.util.List;

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
    private String Customer;
    private List<InvoiceDetail> invoiceDetails;

}
