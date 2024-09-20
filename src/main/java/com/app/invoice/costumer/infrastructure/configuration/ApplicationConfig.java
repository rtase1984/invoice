package com.app.invoice.costumer.infrastructure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.invoice.costumer.application.service.CustomerService;
import com.app.invoice.costumer.application.usecases.CustomerUseCasesImp;
import com.app.invoice.costumer.domain.port.out.CustomerRepositoryPort;
import com.app.invoice.costumer.infrastructure.repositories.CustomerRepositoryImpl;

@Configuration
public class ApplicationConfig {

    @Bean
    public CustomerService customerService(CustomerRepositoryPort customerRepositoryPort){
        return new CustomerService(
            new CustomerUseCasesImp(customerRepositoryPort));
    }

    @Bean
    public CustomerRepositoryPort customerRepositoryPort(CustomerRepositoryImpl customerRepositoryImpl){
        return customerRepositoryImpl;

    }

}
