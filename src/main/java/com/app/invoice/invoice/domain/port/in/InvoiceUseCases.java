package com.app.invoice.invoice.domain.port.in;

import java.util.List;
import java.util.Optional;

import com.app.invoice.invoice.domain.model.Invoice;
import com.app.invoice.invoice.domain.model.InvoiceDetail;

public interface InvoiceUseCases {
    Invoice createInvoice(Invoice invoice);
    Optional<Invoice> updateInvoice(Long idInvoice, Invoice invoice);
    boolean deleteInvoice(Long idInvoice);
    Optional<Invoice> getInvoiceById(Long idInvoice);
    List<Invoice> getAllInvoices();
    List<InvoiceDetail> getInvoiceDetails();

}
