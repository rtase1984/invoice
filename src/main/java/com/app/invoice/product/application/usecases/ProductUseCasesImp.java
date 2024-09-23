package com.app.invoice.product.application.usecases;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import com.app.invoice.product.domain.model.Product;
import com.app.invoice.product.domain.port.in.ProductUseCases;
import com.app.invoice.product.domain.port.out.ProductRepositoryPort;
import com.app.invoice.shared.qr.QRCodeGeneratorPort;
import com.google.zxing.WriterException;

public class ProductUseCasesImp implements ProductUseCases{

    private  final ProductRepositoryPort productRepositoryPort;

    public  ProductUseCasesImp(ProductRepositoryPort productRepositoryPort) {
        this.productRepositoryPort = productRepositoryPort;
    }

    @Override
    public Product createProduct(Product product) {
       return  productRepositoryPort.save(product);
    }

    @Override
    public Optional<Product> updateProduct(Long idProduct, Product product) {
        return  productRepositoryPort.update(idProduct, product);
    }

    @Override
    public boolean deleteProduct(Long idProduct) {
        return  productRepositoryPort.deleteById(idProduct);
    }

    @Override
    public Optional<Product> getProductById(Long idProduct) {
        return  productRepositoryPort.findById(idProduct);
    }

    @Override
    public List<Product> getAllProducts() {
        return  productRepositoryPort.findAll();
    }

}
