package org.java.spring_crud5.repo;

import org.java.spring_crud5.pojo.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
