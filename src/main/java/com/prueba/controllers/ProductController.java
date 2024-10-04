package com.prueba.controllers;

import com.prueba.entities.Product;
import com.prueba.entities.ProductData;
import com.prueba.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        for (ProductData data : product.getData()) {
            data.setProduct(product);
        }
        return productRepository.save(product);
    }
}
