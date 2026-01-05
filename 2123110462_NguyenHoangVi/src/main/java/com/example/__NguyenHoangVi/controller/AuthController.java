package com.example.__NguyenHoangVi.controller;

import com.example.__NguyenHoangVi.entity.User;
import com.example.__NguyenHoangVi.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    // POST http://localhost:8080/api/auth/login
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User req) {

        User user = authService.login(req.getUsername(), req.getPassword());

        if (user == null) {
            return ResponseEntity.status(401).body("Login failed");
        }

        return ResponseEntity.ok(user);
    }
}
