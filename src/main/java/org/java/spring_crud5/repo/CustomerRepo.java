package org.java.spring_crud5.repo;

import org.java.spring_crud5.pojo.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}

