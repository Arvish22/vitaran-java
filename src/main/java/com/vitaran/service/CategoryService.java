package com.vitaran.service;

import java.util.List;
import java.util.Optional;

import com.vitaran.domain.Category;

public interface CategoryService {
	
	public Optional<Category> findById(Long id);
	
	public Category save(Category category);
	
	public List<Category> findAll();
	
	public List<Category> saveAll(List<Category> category);
}
