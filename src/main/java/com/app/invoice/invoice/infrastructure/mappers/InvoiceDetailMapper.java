package com.app.invoice.invoice.infrastructure.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.app.invoice.invoice.domain.model.InvoiceDetail;
import com.app.invoice.invoice.infrastructure.entities.InvoiceDetailEntity;

@Mapper
public interface InvoiceDetailMapper {
    InvoiceDetailMapper INSTANCE =  Mappers.getMapper(InvoiceDetailMapper.class);

    InvoiceDetail toInvoiceDetail(InvoiceDetailEntity entity);
    InvoiceDetailEntity  toInvoiceDetailEntity(InvoiceDetail entity);

}
