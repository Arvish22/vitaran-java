package com.vitaran.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitaran.domain.Product;
import com.vitaran.domain.Store;
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
		return null;//repository.findByName(name);
	}

	@Override
	public Product saveProduct(Product product) {
		return repository.save(product);
	}

	@Override
	public List<Product> getProducts() {
		return (List<Product>) repository.findAll();
	}

	@Override
	public List<Product> saveAllProduct(List<Product> products) {
		return (List<Product>) repository.saveAll(products);
	}

	@Override
	public List<Product> findByStore(Store store) {
		// TODO Auto-generated method stub
		return repository.findByStore(store);
	}

}
