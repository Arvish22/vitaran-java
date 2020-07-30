package com.vitaran.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitaran.domain.ProductCategory;
import com.vitaran.repository.ProductCategoryRepository;
import com.vitaran.service.ProductCategoryService;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService{
	
	@Autowired
	ProductCategoryRepository repository;

	@Override
	public Optional<ProductCategory> findById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public ProductCategory save(ProductCategory proCategory) {
		// TODO Auto-generated method stub
		return repository.save(proCategory);
	}

	@Override
	public List<ProductCategory> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<ProductCategory> saveAll(List<ProductCategory> proCategories) {
		// TODO Auto-generated method stub
		return repository.saveAll(proCategories);
	}
	
	
}
