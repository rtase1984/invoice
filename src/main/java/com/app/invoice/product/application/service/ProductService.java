package com.app.invoice.product.application.service;

import java.util.List;
import java.util.Optional;

import com.app.invoice.product.domain.model.Product;
import com.app.invoice.product.domain.port.in.ProductUseCases;

public class ProductService implements  ProductUseCases {

    private final ProductUseCases productUseCases;

    public  ProductService(ProductUseCases productUseCases) {
        this.productUseCases = productUseCases;
    }

    @Override
    public Product createProduct(Product product) {
        return productUseCases.createProduct(product);
    }

    @Override
    public Optional<Product> updateProduct(Long idProduct, Product product) {
        return productUseCases.updateProduct(idProduct, product);
    }

    @Override
    public boolean deleteProduct(Long idProduct) {
        return productUseCases.deleteProduct(idProduct);
    }

    @Override
    public Optional<Product> getProductById(Long idProduct) {
        return productUseCases.getProductById(idProduct);
    }

    @Override
    public List<Product> getAllProducts() {
        return  productUseCases.getAllProducts();
    }
   
}
