package org.java.spring_crud5.service;

import org.java.spring_crud5.pojo.Product;
import org.java.spring_crud5.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public List<Product> findAll() {
        return productRepo.findAll();
    }

    public Optional<Product> findById(int id) {
        return productRepo.findById(id);
    }

    public void save(Product product) {
        productRepo.save(product);
    }

    public void delete(Product product) {
        productRepo.delete(product);
    }
}

