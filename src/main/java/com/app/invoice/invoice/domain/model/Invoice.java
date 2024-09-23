package com.app.invoice.invoice.domain.model;

import java.text.DateFormat;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Invoice {
    private Long id;
    private String invoiceNumber;
    private DateFormat invoiceDate;
    private DateFormat dueDate;
    private String totalAmount;
    private String paymentStatus;
    private String qrCode;
    private String Customer;
    private List<InvoiceDetail> invoiceDetails;

}
