package com.vitaran.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitaran.domain.Category;
import com.vitaran.repository.CategoryRepository;
import com.vitaran.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	CategoryRepository repository;

	@Override
	public Optional<Category> findById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public Category save(Category category) {
		// TODO Auto-generated method stub
		return repository.save(category);
	}

	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Category> saveAll(List<Category> category) {
		// TODO Auto-generated method stub
		return repository.saveAll(category);
	}
	
	
}
