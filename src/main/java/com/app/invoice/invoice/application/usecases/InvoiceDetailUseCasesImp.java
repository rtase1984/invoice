package com.app.invoice.invoice.application.usecases;

import java.util.List;
import java.util.Optional;


import com.app.invoice.invoice.domain.model.InvoiceDetail;
import com.app.invoice.invoice.domain.port.in.InvoiceDetailUseCases;
import com.app.invoice.invoice.domain.port.out.InvoiceDetailRepositoryPort;

public class InvoiceDetailUseCasesImp implements  InvoiceDetailUseCases {

    private final InvoiceDetailRepositoryPort invoiceDetailRepositoryPort;

    public  InvoiceDetailUseCasesImp(InvoiceDetailRepositoryPort invoiceDetailRepositoryPort) {
        this.invoiceDetailRepositoryPort = invoiceDetailRepositoryPort;
    }

    @Override
    public InvoiceDetail createInvoiceDetail(InvoiceDetail invoiceDetail) {
        return  invoiceDetailRepositoryPort.save(invoiceDetail);
    }

    @Override
    public Optional<InvoiceDetail> updateInvoice(Long idInvoiceDetail, InvoiceDetail invoiceDetail) {
        return  invoiceDetailRepositoryPort.update(idInvoiceDetail, invoiceDetail);
    }

    @Override
    public boolean deleteInvoiceDetail(Long idInvoiceDetail) {
        return   invoiceDetailRepositoryPort.deleteById(idInvoiceDetail);
    }

    @Override
    public Optional<InvoiceDetail> getInvoiceById(Long idInvoiceDetail) {
        return   invoiceDetailRepositoryPort.findById(idInvoiceDetail);
    }

    @Override
    public List<InvoiceDetail> getAllInvoiceDetails() {
        return   invoiceDetailRepositoryPort.findAll();
    }
    
}
