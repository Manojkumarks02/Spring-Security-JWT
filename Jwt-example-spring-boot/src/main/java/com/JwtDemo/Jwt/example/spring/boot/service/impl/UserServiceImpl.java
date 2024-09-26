package com.JwtDemo.Jwt.example.spring.boot.service.impl;

import com.JwtDemo.Jwt.example.spring.boot.entities.User;
import com.JwtDemo.Jwt.example.spring.boot.repository.UserRepository;
import com.JwtDemo.Jwt.example.spring.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void registerUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }
}
