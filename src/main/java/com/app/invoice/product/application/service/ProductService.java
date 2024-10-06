package com.app.invoice.product.application.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import com.app.invoice.product.domain.model.Product;
import com.app.invoice.product.domain.port.in.ProductUseCases;
import com.app.invoice.shared.qr.QRCodeGeneratorPort;
import com.google.zxing.WriterException;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProductService implements  ProductUseCases {

    private final ProductUseCases productUseCases;
    private final QRCodeGeneratorPort qrCodeGenerator; 
    

    @Override
    public Product createProduct(Product product) {
        String productData = "&Name=" + product.getName() + "\n" +
                             "&Price=" + product.getUnitPrice();
        byte[] qrCode = null;
        try {
            qrCode = qrCodeGenerator.generateQRCode(productData);
        } 
        catch (WriterException e) {
            e.printStackTrace();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }

        product.setQrCodeImage(qrCode);
        Product createdProduct = productUseCases.createProduct(product);
        
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
