package com.app.invoice.invoice.domain.port.out;

import java.util.List;
import java.util.Optional;

import com.app.invoice.invoice.domain.model.InvoiceDetail;

public interface InvoiceDetailRepositoryPort {
    InvoiceDetail save(InvoiceDetail invoiceDetail); 
    Optional<InvoiceDetail> update(Long idInvoiceDetail, InvoiceDetail invoiceDetail);
    boolean deleteById(Long idInvoiceDetail);
    Optional<InvoiceDetail> findById(Long idInvoiceDetail);
    List<InvoiceDetail> findAll();

}
