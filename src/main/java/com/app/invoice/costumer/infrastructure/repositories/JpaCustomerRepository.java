package com.app.invoice.costumer.infrastructure.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.invoice.costumer.infrastructure.entities.CustomerEntity;


@Repository
public interface JpaCustomerRepository extends JpaRepository<CustomerEntity, Long> {

}
