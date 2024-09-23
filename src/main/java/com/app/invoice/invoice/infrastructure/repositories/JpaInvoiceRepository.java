package com.app.invoice.invoice.infrastructure.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.invoice.invoice.infrastructure.entities.InvoiceEntity;


@Repository
public interface JpaInvoiceRepository extends JpaRepository<InvoiceEntity, Long> {

}
