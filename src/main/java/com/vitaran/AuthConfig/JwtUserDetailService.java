package com.vitaran.AuthConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.vitaran.repository.UserRepository;

@Service
public class JwtUserDetailService implements UserDetailsService{
	
	@Autowired
	UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		UserDetails userDetails = repository.findByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("User not found"));
		
		return userDetails;
	}
}
