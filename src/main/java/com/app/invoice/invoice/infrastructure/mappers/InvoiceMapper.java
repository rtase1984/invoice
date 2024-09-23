package com.app.invoice.invoice.infrastructure.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


import com.app.invoice.invoice.domain.model.Invoice;
import com.app.invoice.invoice.infrastructure.entities.InvoiceEntity;


@Mapper
public interface InvoiceMapper {
    InvoiceMapper INSTANCE =  Mappers.getMapper(InvoiceMapper.class);


    Invoice toDomain(InvoiceEntity invoiceEntity);
    InvoiceEntity toEntity(Invoice invoice);

}
