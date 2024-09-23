package com.app.invoice.product.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.invoice.product.infrastructure.entities.ProductEntity;

public interface ProductJpaRepository extends JpaRepository<ProductEntity, Long>{

}
