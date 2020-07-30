package com.vitaran.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vitaran.domain.Category;
import com.vitaran.domain.Store;

@Repository
public interface StoreRepository extends CrudRepository<Store, Long>{

	public List<Store> findByCategory(Category category);
}
