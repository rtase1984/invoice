package com.app.invoice.invoice.domain.port.out;

import java.util.List;
import java.util.Optional;

import com.app.invoice.invoice.domain.model.Invoice;

public interface InvoiceRepositoryPort {
    Invoice save(Invoice invoice); 
    Optional<Invoice> update(Long idInvoice, Invoice invoice);
    boolean deleteById(Long idInvoice);
    Optional<Invoice> findById(Long idInvoice);
    List<Invoice> findAll();
}
