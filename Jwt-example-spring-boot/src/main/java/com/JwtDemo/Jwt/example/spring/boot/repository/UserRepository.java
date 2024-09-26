package com.JwtDemo.Jwt.example.spring.boot.repository;

import com.JwtDemo.Jwt.example.spring.boot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    //    User findByEmail(String userName);
    User findByUsername(String username);

//    User findByUsernameOrEmail(String usernameOrEmail, String usernameOrEmail1);
}
