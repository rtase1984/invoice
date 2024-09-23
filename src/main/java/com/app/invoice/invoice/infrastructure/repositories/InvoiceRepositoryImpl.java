package com.app.invoice.invoice.infrastructure.repositories;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.app.invoice.invoice.domain.model.Invoice;
import com.app.invoice.invoice.domain.port.out.InvoiceRepositoryPort;
import com.app.invoice.invoice.infrastructure.entities.InvoiceEntity;
import com.app.invoice.invoice.infrastructure.mappers.InvoiceMapper;

@Repository
public class InvoiceRepositoryImpl implements InvoiceRepositoryPort{

    private final JpaInvoiceRepository repository;

    
    public InvoiceRepositoryImpl(JpaInvoiceRepository repository) {
        this.repository = repository;
    }

    @Override
    public Invoice save(Invoice invoice) {
        InvoiceEntity invoiceEntity = InvoiceMapper.INSTANCE.toEntity(invoice);
        InvoiceEntity savedInvoice = repository.save(invoiceEntity);
        return InvoiceMapper.INSTANCE.toDomain(savedInvoice);
    }

    @Override
    public Optional<Invoice> update(Long idInvoice, Invoice invoice) {
        if (repository.existsById(invoice.getId())) {
            InvoiceEntity invoiceEntity = InvoiceMapper.INSTANCE.toEntity(invoice);
            InvoiceEntity updatedEntity = repository.save(invoiceEntity);
            return Optional.of(InvoiceMapper.INSTANCE.toDomain(updatedEntity));
        }
        return Optional.empty();

    }

    @Override
    public boolean deleteById(Long idInvoice) {
        if (repository.existsById(idInvoice)) {
            repository.deleteById(idInvoice);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Invoice> findById(Long idInvoice) {
        return repository.findById(idInvoice)
                        .map(InvoiceMapper.INSTANCE::toDomain);
        
    }

    @Override
    public List<Invoice> findAll() {
        return repository.findAll()
            .stream()
            .map(InvoiceMapper.INSTANCE::toDomain)
            .collect(Collectors.toList());
    }

}
