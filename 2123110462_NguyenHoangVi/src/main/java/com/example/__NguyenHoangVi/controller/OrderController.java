package com.example.__NguyenHoangVi.controller;

import com.example.__NguyenHoangVi.entity.Order;
import com.example.__NguyenHoangVi.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderRepository repo;

    // GET http://localhost:8080/api/orders
    @GetMapping
    public List<Order> getAll() {
        return repo.findAll();
    }

    // POST http://localhost:8080/api/orders
    @PostMapping
    public Order create(@RequestBody Order o) {
        return repo.save(o);
    }
}
