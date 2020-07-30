package com.vitaran.service;

import java.util.List;
import java.util.Optional;

import com.vitaran.domain.Category;
import com.vitaran.domain.Store;

public interface StoreService {
	
	public Optional<Store> findById(Long id);
	
	public List<Store> findByCategory(Category category);
	
	public Store save(Store store);
	
	public List<Store> findAll();
	
	public List<Store> saveAll(List<Store> stores);

}
