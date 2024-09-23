package com.app.invoice.product.application.service;

import java.util.List;
import java.util.Optional;

import com.app.invoice.product.domain.model.Product;
import com.app.invoice.product.domain.port.in.ProductUseCases;
import com.app.invoice.shared.qr.QRCodeGeneratorPort;


public class ProductService implements  ProductUseCases {

    private final ProductUseCases productUseCases;
    private final QRCodeGeneratorPort qrCodeGenerator; 
    

    public  ProductService(ProductUseCases productUseCases, QRCodeGeneratorPort qrCodeGenerator) {
        this.productUseCases = productUseCases;
        this.qrCodeGenerator = qrCodeGenerator;
    }

    @Override
    public Product createProduct(Product product) {
        // Lógica para crear el producto
        Product createdProduct = productUseCases.createProduct(product);
        
        // Generar el QR para el producto creado
        String productData = "id=" + createdProduct.getId() +
                             "&name=" + createdProduct.getName() +
                             "&price=" + createdProduct.getUnitPrice();
        byte[] qrCode = qrCodeGenerator.generateQRCode(productData);
        createdProduct.setQrCodeImge(qrCode);  // Asignar el QR al producto
        
        return createdProduct;

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
