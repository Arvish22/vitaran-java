package com.vitaran.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.vitaran.domain.Product;
import com.vitaran.domain.Store;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
	
	
	public List<Product> findByStore(Store store);
	
}
