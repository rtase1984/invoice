package com.app.invoice.costumer.domain.port.in;

import java.util.List;
import java.util.Optional;

import com.app.invoice.costumer.domain.model.Customer;

public interface CustomerUseCases {
    Customer createCustomer(Customer customer);
    Optional<Customer> updateCustomer(Long idCustomer, Customer customer);
    boolean deleteCustomer(Long idCustomer);
    Optional<Customer> getCustomerById(Long idCustomer);
    List<Customer> getAllCustomers();

}
