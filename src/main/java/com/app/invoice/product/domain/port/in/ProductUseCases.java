package com.app.invoice.product.domain.port.in;

import java.util.List;
import java.util.Optional;

import com.app.invoice.product.domain.model.Product;


public interface ProductUseCases {
    Product createProduct(Product product);
    Optional<Product> updateProduct(Long idProduct, Product product);
    boolean deleteProduct(Long idProduct);
    Optional<Product> getProductById(Long idProduct);
    List<Product> getAllProducts();

}
