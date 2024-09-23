package com.app.invoice.costumer.infrastructure.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.invoice.costumer.infrastructure.entities.CostumerEntity;


@Repository
public interface JpaCostumerRepository extends JpaRepository<CostumerEntity, Long> {

}
