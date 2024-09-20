package com.app.invoice.costumer.infrastructure.repositories;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.app.invoice.costumer.domain.model.Customer;
import com.app.invoice.costumer.domain.port.out.CustomerRepositoryPort;
import com.app.invoice.costumer.infrastructure.entities.CustomerEntity;
import com.app.invoice.costumer.infrastructure.mappers.CustomerMapper;

@Repository
public class CustomerRepositoryImpl implements CustomerRepositoryPort{

    private final JpaCustomerRepository jpaCustomerRepository;

    
    public CustomerRepositoryImpl(JpaCustomerRepository jpaCustomerRepository) {
        this.jpaCustomerRepository = jpaCustomerRepository;
    }

    @Override
    public Customer save(Customer customer) {
        CustomerEntity customerEntity = CustomerMapper.INSTANCE.toEntity(customer);
        CustomerEntity savedCustomer = jpaCustomerRepository.save(customerEntity);
        return CustomerMapper.INSTANCE.toDomain(savedCustomer);
    }

    @Override
    public Optional<Customer> update(Long idCustomer, Customer customer) {
        if (jpaCustomerRepository.existsById(customer.getId())) {
            CustomerEntity customerEntity = CustomerMapper.INSTANCE.toEntity(customer);
            CustomerEntity updatedEntity = jpaCustomerRepository.save(customerEntity);
            return Optional.of(CustomerMapper.INSTANCE.toDomain(updatedEntity));
        }
        return Optional.empty();

    }

    @Override
    public boolean deleteById(Long idCustomer) {
        if (jpaCustomerRepository.existsById(idCustomer)) {
            jpaCustomerRepository.deleteById(idCustomer);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Customer> findById(Long idCustomer) {
        return jpaCustomerRepository.findById(idCustomer)
                        .map(CustomerMapper.INSTANCE::toDomain);
        
    }

    @Override
    public List<Customer> findAll() {
        return jpaCustomerRepository.findAll()
            .stream()
            .map(CustomerMapper.INSTANCE::toDomain)
            .collect(Collectors.toList());
    }

}
