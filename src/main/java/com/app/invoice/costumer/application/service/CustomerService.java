package com.app.invoice.costumer.application.service;

import java.util.List;
import java.util.Optional;

import com.app.invoice.costumer.domain.model.Customer;
import com.app.invoice.costumer.domain.port.in.CustomerUseCases;

public class CustomerService implements CustomerUseCases {

    private final CustomerUseCases customerUseCases;

    public CustomerService(CustomerUseCases customerUseCases){
        this.customerUseCases = customerUseCases;
    }

    @Override
    public Customer createCustomer(Customer customer) {
       return customerUseCases.createCustomer(customer);
    }

    @Override
    public Optional<Customer> updateCustomer(Long idCustomer, Customer customer) {
       return customerUseCases.updateCustomer(idCustomer, customer);
    }

    @Override
    public boolean deleteCustomer(Long idCustomer) {
       return customerUseCases.deleteCustomer(idCustomer);
    }

    @Override
    public Optional<Customer> getCustomerById(Long idCustomer) {
        return customerUseCases.getCustomerById(idCustomer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerUseCases.getAllCustomers();
    }

}
