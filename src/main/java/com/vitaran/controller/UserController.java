package com.vitaran.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vitaran.domain.User;
import com.vitaran.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;
	
	@Autowired
	PasswordEncoder encoder;
	
	@GetMapping("/user")
	public Optional<User> getProduct() {
		return service.loadUserByUsername("admin");
	}
	
	@GetMapping("/users")
	public List<User> getUsers() {
		return service.findAll();
	}

	@PutMapping("/user")
	public User saveUser(@RequestBody User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		return service.save(user);
	}
}
