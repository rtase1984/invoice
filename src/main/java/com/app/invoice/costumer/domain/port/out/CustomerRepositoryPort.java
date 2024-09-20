package com.app.invoice.costumer.domain.port.out;

import java.util.List;
import java.util.Optional;



import com.app.invoice.costumer.domain.model.Customer;

public interface CustomerRepositoryPort {
    Customer save(Customer customer); 
    Optional<Customer> update(Long idCustomer, Customer customer);
    boolean deleteById(Long idCustomer);
    Optional<Customer> findById(Long idCustomer);
    List<Customer> findAll();
}
