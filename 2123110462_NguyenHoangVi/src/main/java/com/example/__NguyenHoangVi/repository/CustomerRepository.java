package com.example.__NguyenHoangVi.repository;

import com.example.__NguyenHoangVi.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
