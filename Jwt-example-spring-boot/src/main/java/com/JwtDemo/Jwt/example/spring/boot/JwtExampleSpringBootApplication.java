package com.JwtDemo.Jwt.example.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class JwtExampleSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtExampleSpringBootApplication.class, args);
	}
//
//	@Bean
//	public PasswordEncoder passwordEncoder () {
//		return NoOpPasswordEncoder.getInstance();
//	}

}
