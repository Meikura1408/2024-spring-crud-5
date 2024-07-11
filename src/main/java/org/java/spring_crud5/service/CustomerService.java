package org.java.spring_crud5.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.Hibernate;
import org.java.spring_crud5.pojo.Customer;
import org.java.spring_crud5.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    public List<Customer> findAll() {
        return customerRepo.findAll();
    }

    public Optional<Customer> findById(int id) {
        return customerRepo.findById(id);
    }

    @Transactional
    public Optional<Customer> findByIdWithOrders(int id) {
        Optional<Customer> customer = findById(id);

        if (customer.isEmpty())
            return Optional.empty();

        Hibernate.initialize(customer.get().getOrders());

        return customer;
    }

    public void save(Customer customer) {
        customerRepo.save(customer);
    }

    public void delete(Customer customer) {
        customerRepo.delete(customer);
    }
}