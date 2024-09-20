package com.app.invoice.costumer.application.usecases;

import java.util.List;
import java.util.Optional;

import com.app.invoice.costumer.domain.model.Customer;
import com.app.invoice.costumer.domain.port.in.CustomerUseCases;
import com.app.invoice.costumer.domain.port.out.CustomerRepositoryPort;

public class CustomerUseCasesImp implements CustomerUseCases{

    private final CustomerRepositoryPort customerRepositoryPort;

    public CustomerUseCasesImp(CustomerRepositoryPort customerRepositoryPort){
        this.customerRepositoryPort = customerRepositoryPort;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepositoryPort.save(customer);
    }

    @Override
    public Optional<Customer> updateCustomer(Long idCustomer, Customer customer) {
        return customerRepositoryPort.update(idCustomer, customer);
    }

    @Override
    public boolean deleteCustomer(Long idCustomer) {
        return customerRepositoryPort.deleteById(idCustomer);
    }

    @Override
    public Optional<Customer> getCustomerById(Long idCustomer) {
      return customerRepositoryPort.findById(idCustomer)
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepositoryPort.findAll();
    }

}
