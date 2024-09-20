package com.app.invoice.costumer.infrastructure.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.app.invoice.costumer.domain.model.Customer;
import com.app.invoice.costumer.infrastructure.entities.CustomerEntity;

@Mapper
public interface CustomerMapper {
    CustomerMapper INSTANCE =  Mappers.getMapper(CustomerMapper.class);


    Customer toDomain(CustomerEntity customerEntity);
    CustomerEntity toEntity(Customer customer);

}

