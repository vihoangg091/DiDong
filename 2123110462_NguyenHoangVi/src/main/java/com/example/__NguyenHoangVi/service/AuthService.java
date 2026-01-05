package com.example.__NguyenHoangVi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.__NguyenHoangVi.entity.User;
import com.example.__NguyenHoangVi.repository.UserRepository;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepo;

    public User login(String username, String password) {
        return userRepo.findByUsername(username)
                .filter(u -> u.getPassword().equals(password))
                .orElse(null);
    }
}
