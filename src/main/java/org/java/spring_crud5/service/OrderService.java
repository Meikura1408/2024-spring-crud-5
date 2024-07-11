package org.java.spring_crud5.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.Hibernate;
import org.java.spring_crud5.pojo.Order;
import org.java.spring_crud5.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderRepo orderRepo;

    public List<Order> findAll() {
        return orderRepo.findAll();
    }

    @Transactional
    public List<Order> findAllWithItems() {
        List<Order> orders = findAll();

        for (Order order : orders) {
            Hibernate.initialize(order.getItems());
        }

        return orders;
    }

    public Optional<Order> findById(int id) {
        return orderRepo.findById(id);
    }

    @Transactional
    public Optional<Order> findByIdWithItems(int id) {
        Optional<Order> order = findById(id);

        if (order.isEmpty())
            return Optional.empty();

        Hibernate.initialize(order.get().getItems());

        return order;
    }

    public void save(Order order) {
        orderRepo.save(order);
    }

    public void delete(Order order) {
        orderRepo.delete(order);
    }
}
