package com.app.invoice.invoice.application.usecases;

import java.util.List;
import java.util.Optional;

import com.app.invoice.invoice.domain.model.Invoice;
import com.app.invoice.invoice.domain.port.in.InvoiceUseCases;
import com.app.invoice.invoice.domain.port.out.InvoiceRepositoryPort;

public class InvoiceUseCasesImp implements  InvoiceUseCases {
    private  final InvoiceRepositoryPort invoiceRepositoryPort;

    public  InvoiceUseCasesImp(InvoiceRepositoryPort invoiceRepositoryPort) {
        this.invoiceRepositoryPort = invoiceRepositoryPort;
    }

    @Override
    public Invoice createInvoice(Invoice invoice) {
        return invoiceRepositoryPort.save(invoice);
    }

    @Override
    public Optional<Invoice> updateInvoice(Long idInvoice, Invoice invoice) {
        return invoiceRepositoryPort.update(idInvoice, invoice);
    }

    @Override
    public boolean deleteInvoice(Long idInvoice) {
        return invoiceRepositoryPort.deleteById(idInvoice);
    }

    @Override
    public Optional<Invoice> getInvoiceById(Long idInvoice) {
        return invoiceRepositoryPort.findById(idInvoice);
    }

    @Override
    public List<Invoice> getAllInvoices() {
        return invoiceRepositoryPort.findAll();
    }

}
