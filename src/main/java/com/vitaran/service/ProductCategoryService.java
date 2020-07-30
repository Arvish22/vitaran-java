package com.vitaran.service;

import java.util.List;
import java.util.Optional;

import com.vitaran.domain.Product;
import com.vitaran.domain.ProductCategory;

public interface ProductCategoryService {

	Optional<ProductCategory> findById(Long id);

	ProductCategory save(ProductCategory proCategory);

	List<ProductCategory> findAll();

	List<ProductCategory> saveAll(List<ProductCategory> proCategories);
}
