package com.app.invoice.product.infrastructure.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.app.invoice.invoice.infrastructure.mappers.InvoiceDetailMapper;
import com.app.invoice.product.domain.model.Product;
import com.app.invoice.product.infrastructure.dto.ProductDTO;
import com.app.invoice.product.infrastructure.entities.ProductEntity;



@Mapper(uses = InvoiceDetailMapper.class)
public interface ProductMapper {
    ProductMapper INSTANCE =  Mappers.getMapper(ProductMapper.class);

    @Mapping(target = "qrCodeImage", source = "qrCodeImage")
    Product toDomain(ProductEntity productEntity);
    
    @Mapping(target = "qrCodeImage", source = "qrCodeImage")
    ProductEntity toEntity(Product product);

    ProductDTO  toDTO(Product product);

    @Mapping(target = "invoiceDetails", ignore = true)
    Product fromDTO(ProductDTO productDTO);

}
