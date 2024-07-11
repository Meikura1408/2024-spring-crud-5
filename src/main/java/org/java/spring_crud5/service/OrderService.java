package org.java.spring_crud5.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.Hibernate;
import org.java.spring_crud5.pojo.Ordine;
import org.java.spring_crud5.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderRepo orderRepo;

    public List<Ordine> findAll() {
        return orderRepo.findAll();
    }

    @Transactional
    public List<Ordine> findAllWithItems() {
        List<Ordine> orders = findAll();

        for (Ordine order : orders) {
            Hibernate.initialize(order.getItems());
        }

        return orders;
    }

    public Optional<Ordine> findById(int id) {
        return orderRepo.findById(id);
    }

    @Transactional
    public Optional<Ordine> findByIdWithItems(int id) {
        Optional<Ordine> order = findById(id);

        if (order.isEmpty())
            return Optional.empty();

        Hibernate.initialize(order.get().getItems());

        return order;
    }

    public void save(Ordine order) {
        orderRepo.save(order);
    }

    public void delete(Ordine order) {
        orderRepo.delete(order);
    }
}
