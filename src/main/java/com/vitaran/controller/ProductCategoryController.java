package com.vitaran.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vitaran.domain.ProductCategory;
import com.vitaran.service.ProductCategoryService;

@RestController
@RequestMapping("/api")
public class ProductCategoryController {
	
	@Autowired
	ProductCategoryService categoryService;
	
	@GetMapping("/product/category/{id}")
    public Optional<ProductCategory> findById(@PathVariable Long id){
		return categoryService.findById(id);
	}
	
	@PostMapping("/product/category")
	public ProductCategory save(@RequestBody ProductCategory ProductCategory) {
		return categoryService.save(ProductCategory);
	}
	
	@GetMapping("/product/categories")
	public List<ProductCategory> findAll(){
		return categoryService.findAll();
	}
	
	@PostMapping("/product/categories")
	public List<ProductCategory> saveAll(@RequestBody List<ProductCategory> ProductCategory){
		return categoryService.saveAll(ProductCategory);
	}
}
