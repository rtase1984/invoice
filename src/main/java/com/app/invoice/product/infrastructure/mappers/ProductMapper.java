package com.app.invoice.product.infrastructure.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.app.invoice.invoice.infrastructure.mappers.InvoiceDetailMapper;
import com.app.invoice.product.domain.model.Product;
import com.app.invoice.product.infrastructure.entities.ProductEntity;



@Mapper(uses = InvoiceDetailMapper.class)
public interface ProductMapper {
    ProductMapper INSTANCE =  Mappers.getMapper(ProductMapper.class);

    Product toDomain(ProductEntity productEntity);
    ProductEntity toEntity(Product product);

}
