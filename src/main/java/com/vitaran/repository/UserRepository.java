package com.vitaran.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import com.vitaran.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	@Query(value = "select * from user u where u.username = :username", nativeQuery = true)
	public Optional<User> findByUsername(String username);
}
