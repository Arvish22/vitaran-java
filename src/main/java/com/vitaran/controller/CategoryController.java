package com.vitaran.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vitaran.domain.Category;
import com.vitaran.service.CategoryService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	@GetMapping("/category/{id}")
    public Optional<Category> findById(@PathVariable Long id){
		return categoryService.findById(id);
	}
	
	@PostMapping("/category")
	public Category save(@RequestBody Category category) {
		return categoryService.save(category);
	}
	
	@GetMapping("/categories")
	public List<Category> findAll(){
		return categoryService.findAll();
	}
	
	@PostMapping("/categories")
	public List<Category> saveAll(List<Category> category){
		return categoryService.saveAll(category);
	}
}
