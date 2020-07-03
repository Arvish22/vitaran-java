package com.vitaran.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitaran.domain.Product;
import com.vitaran.repository.ProductRepository;
import com.vitaran.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	public ProductRepository repository;

	@Override
	public Optional<Product> getProduct(Long id) {
		return repository.findById(id);
	}
	
	public List<Product> getProductByName(String name) {
		return repository.findByName(name);
	}

	@Override
	public Product saveProduct(Product product) {
		return repository.save(product);
	}

	@Override
	public List<Product> getProducts() {
		return repository.findAll();
	}

	@Override
	public List<Product> saveAllProduct(List<Product> products) {
		return repository.saveAll(products);
	}

}
