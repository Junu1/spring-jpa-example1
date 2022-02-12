package com.example.spring.jpa.example.controller;

import com.example.spring.jpa.example.model.Product;
import com.example.spring.jpa.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<String> addProduct(@RequestBody Product product) {
        productRepository.save(product);
        return ResponseEntity.ok("Product successfully added");

    }

    @PutMapping
    public ResponseEntity<String> updateProduct(@RequestBody Product product) {
        productRepository.save(product);
        return ResponseEntity.ok("Product successfully updated");
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable int id) {
        Product product = productRepository.getById(id);
        productRepository.delete(product);
        return ResponseEntity.ok("Succcessfully deleted");
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable int id) {
        Product product = productRepository.findById(id).get();
        return ResponseEntity.ok(product);

    }


}
