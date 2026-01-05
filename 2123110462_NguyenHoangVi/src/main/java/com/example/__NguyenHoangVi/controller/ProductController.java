package com.example.__NguyenHoangVi.controller;

import com.example.__NguyenHoangVi.entity.Product;
import com.example.__NguyenHoangVi.repository.ProductRepository;
import com.example.__NguyenHoangVi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository repo;

    @PostMapping
    public Product create(@RequestBody Product p) {
        return repo.save(p);
    }

    @GetMapping
    public List<Product> getAll() {
        return repo.findAll();
    }
}
