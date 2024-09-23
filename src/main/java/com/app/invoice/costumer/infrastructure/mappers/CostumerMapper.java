package com.app.invoice.costumer.infrastructure.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.app.invoice.costumer.domain.model.Costumer;
import com.app.invoice.costumer.infrastructure.entities.CostumerEntity;

@Mapper
public interface CostumerMapper {
    CostumerMapper INSTANCE =  Mappers.getMapper(CostumerMapper.class);

    Costumer toDomain(CostumerEntity costumerEntity);
    CostumerEntity toEntity(Costumer costumer);

}

