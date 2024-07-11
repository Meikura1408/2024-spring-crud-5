package org.java.spring_crud5.repo;

import org.java.spring_crud5.pojo.Ordine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<Ordine, Integer> {
}

