package com.vitaran.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vitaran.domain.Category;
import com.vitaran.domain.Product;
import com.vitaran.domain.Store;
import com.vitaran.service.ProductService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ProductController {

	@Autowired
	public ProductService service;

	@GetMapping("/product/{id}")
	public Optional<Product> getProduct(@PathVariable Long id) {
		return service.getProduct(id);
	}
	
	@PostMapping("/store/products")
    public List<Product> findByStore(@RequestBody Store store){
		return service.findByStore(store);
	}
	
	@GetMapping("/products")
	public List<Product> getProducts() {
		return service.getProducts();
	}

	@PostMapping("/products")
	public List<Product> getProduct(@RequestBody List<Product> products) {
		return service.saveAllProduct(products);
	}

	@PutMapping("/product")
	public Product getProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}
}
