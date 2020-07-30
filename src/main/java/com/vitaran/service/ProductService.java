package com.vitaran.service;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RequestBody;

import com.vitaran.domain.Product;
import com.vitaran.domain.Store;

public interface ProductService {
	
	public Optional<Product> getProduct(Long id);
	
	public Product saveProduct(Product product);
	
	public List<Product> getProducts();
	
	public List<Product> saveAllProduct(List<Product> products);
	
	public List<Product> getProductByName(String name);
	
	public List<Product> findByStore(Store store);
}
