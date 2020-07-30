package com.vitaran.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitaran.domain.User;
import com.vitaran.repository.UserRepository;
import com.vitaran.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	public UserRepository repository;

	@Override
	public Optional<User> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return repository.save(user);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	
	@Override
	public Optional<User> loadUserByUsername(String username) {
		// TODO Auto-generated method stub
		return repository.findByUsername(username);
	}

}
