package com.app.invoice.product.domain.port.out;

import java.util.List;
import java.util.Optional;

import com.app.invoice.product.domain.model.Product;



public interface ProductRepositoryPort {
    Product save(Product product); 
    Optional<Product> update(Long idProduct, Product product);
    boolean deleteById(Long idProduct);
    Optional<Product> findById(Long idProduct);
    List<Product> findAll();
}
