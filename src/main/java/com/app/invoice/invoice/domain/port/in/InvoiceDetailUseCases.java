package com.app.invoice.invoice.domain.port.in;

import java.util.List;
import java.util.Optional;

import com.app.invoice.invoice.domain.model.InvoiceDetail;

public interface InvoiceDetailUseCases {
    InvoiceDetail createInvoiceDetail(InvoiceDetail invoiceDetail);
    Optional<InvoiceDetail> updateInvoice(Long idInvoiceDetail, InvoiceDetail invoiceDetail);
    boolean deleteInvoiceDetail(Long idInvoiceDetail);
    Optional<InvoiceDetail> getInvoiceById(Long idInvoiceDetail);
    List<InvoiceDetail> getAllInvoiceDetails();

}
