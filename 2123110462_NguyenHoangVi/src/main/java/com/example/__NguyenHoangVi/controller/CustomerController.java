package com.example.__NguyenHoangVi.controller;

import com.example.__NguyenHoangVi.entity.Customer;
import com.example.__NguyenHoangVi.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository repo;

    // GET http://localhost:8080/api/customers
    @GetMapping
    public List<Customer> getAll() {
        return repo.findAll();
    }
}
