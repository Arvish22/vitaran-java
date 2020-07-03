package com.vitaran.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vitaran.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	
	@Query(value = "select * from product p where p.name = :name", nativeQuery = true)
	public List<Product> findByName(String name);
	
}
