package com.vitaran.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vitaran.domain.Category;
import com.vitaran.domain.Store;
import com.vitaran.repository.StoreRepository;
import com.vitaran.service.StoreService;

@Service
public class StoreServiceImpl implements StoreService{
	
	@Autowired
	StoreRepository storeRepository;

	@Override
	public Optional<Store> findById(Long id) {
		// TODO Auto-generated method stub
		return storeRepository.findById(id);
	}

	@Override
	public Store save(Store store) {
		// TODO Auto-generated method stub
		return storeRepository.save(store);
	}

	@Override
	public List<Store> findAll() {
		// TODO Auto-generated method stub
		return (List<Store>) storeRepository.findAll();
	}

	@Override
	public List<Store> saveAll(List<Store> stores) {
		// TODO Auto-generated method stub
		return (List<Store>) storeRepository.saveAll(stores);
	}
	
	@Override
	public List<Store> findByCategory(Category category) {
		// TODO Auto-generated method stub
		return storeRepository.findByCategory(category);
	}

}
