package com.app.invoice.invoice.application.service;

import java.util.List;
import java.util.Optional;

import com.app.invoice.invoice.domain.model.Invoice;
import com.app.invoice.invoice.domain.model.InvoiceDetail;
import com.app.invoice.invoice.domain.port.in.InvoiceDetailUseCases;
import com.app.invoice.invoice.domain.port.in.InvoiceUseCases;

public class InvoiceService implements InvoiceUseCases{

    private final InvoiceDetailUseCases invoiceDetailUseCases;

    @Override
    public Invoice createInvoice(Invoice invoice) {
        return  invoiceDetailUseCases.createInvoice(invoice);
    }

    @Override
    public Optional<Invoice> updateInvoice(Long idInvoice, Invoice invoice) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateInvoice'");
    }

    @Override
    public boolean deleteInvoice(Long idInvoice) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteInvoice'");
    }

    @Override
    public Optional<Invoice> getInvoiceById(Long idInvoice) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getInvoiceById'");
    }

    @Override
    public List<Invoice> getAllInvoices() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllInvoices'");
    }

    @Override
    public List<InvoiceDetail> getInvoiceDetails() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getInvoiceDetails'");
    }

}
