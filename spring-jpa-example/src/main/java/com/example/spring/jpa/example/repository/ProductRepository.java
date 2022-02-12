package com.example.spring.jpa.example.repository;

import com.example.spring.jpa.example.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
