package com.JwtDemo.Jwt.example.spring.boot.controller;


import com.JwtDemo.Jwt.example.spring.boot.entities.User;
import com.JwtDemo.Jwt.example.spring.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register") // http://localhost:8083/api/register
    public String registerUser(@RequestBody User user){
         userService.registerUser(user);
        return "User Register Successfully..!";
    }
}
