package org.java.spring_crud5.repo;

import org.java.spring_crud5.pojo.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Integer> {
}

