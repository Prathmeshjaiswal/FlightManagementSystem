package com.spring.service;

import com.spring.model.Admin;
import com.spring.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;
@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;


    public Admin createAdmin(Admin admin) {
        admin.setPassword(admin.getPassword());
        return adminRepository.save(admin);
    }

    public Admin findByUsername(String username) {
        return adminRepository.findByUsername(username);
    }
}