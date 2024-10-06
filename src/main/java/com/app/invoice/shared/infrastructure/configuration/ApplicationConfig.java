package com.app.invoice.shared.infrastructure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.invoice.costumer.application.service.CostumerService;
import com.app.invoice.costumer.application.usecases.CostumerUseCasesImp;
import com.app.invoice.costumer.domain.port.out.CostumerRepositoryPort;
import com.app.invoice.costumer.infrastructure.repositories.CostumerRepositoryImpl;
import com.app.invoice.product.application.service.ProductService;
import com.app.invoice.product.application.usecases.ProductUseCasesImp;
import com.app.invoice.product.domain.port.out.ProductRepositoryPort;
import com.app.invoice.product.infrastructure.repositories.ProductJpaRepository;
import com.app.invoice.product.infrastructure.repositories.ProductRepositoryImpl;
import com.app.invoice.shared.qr.QRCodeGeneratorPort;
import com.app.invoice.shared.qr.QRCodeService;

import jakarta.persistence.EntityManagerFactory;

@Configuration
public class ApplicationConfig {

    @Bean
    public CostumerService costumerService(CostumerRepositoryPort costumerRepositoryPort){
        return new CostumerService(
            new CostumerUseCasesImp(costumerRepositoryPort));
    }

    @Bean
    public CostumerRepositoryPort costumerRepositoryPort(CostumerRepositoryImpl costumerRepositoryPort){
        return costumerRepositoryPort;

    }

    @Bean
    public ProductService productService(ProductRepositoryPort productRepositoryPort){
        return new ProductService(
            new ProductUseCasesImp(productRepositoryPort), new QRCodeService()
            );
    }


    @Bean
    public ProductRepositoryPort productRepositoryPort(ProductJpaRepository productJpaRepository) {
        return new ProductRepositoryImpl(productJpaRepository);
    }



}
