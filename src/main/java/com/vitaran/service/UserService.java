package com.vitaran.service;

import java.util.List;
import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;

import com.vitaran.domain.User;

public interface UserService {

    public Optional<User> findById(Long id);
	
	public User save(User user);
	
	public List<User> findAll();

	public Optional<User> loadUserByUsername(String username);
}
