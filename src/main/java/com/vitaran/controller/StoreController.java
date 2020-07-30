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
import com.vitaran.domain.Store;
import com.vitaran.service.StoreService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class StoreController {
	
	
	@Autowired
	StoreService storeService;
	
	@GetMapping("/store/{id}")
    public Optional<Store> findById(@PathVariable Long id){
		return storeService.findById(id);
	}
	
	@PostMapping("/categoryStore")
    public List<Store> findByCategory(@RequestBody Category category){
		return storeService.findByCategory(category);
	}
	
	@PostMapping("/store")
	public Store save(@RequestBody Store store) {
		return storeService.save(store);
	}
	
	@GetMapping("/stores")
	public List<Store> findAll(){
		return storeService.findAll();
	}
	
	@PostMapping("/stores")
	public List<Store> saveAll(@RequestBody List<Store> stores){
		return storeService.saveAll(stores);
	}
}
