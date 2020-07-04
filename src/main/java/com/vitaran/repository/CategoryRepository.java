package com.vitaran.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vitaran.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
