package com.vitaran.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ProductCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String type;
	
	@OneToMany
    private List<Product> products;
	
	@ManyToOne
    @JoinColumn(name = "store_id", referencedColumnName = "id")
    private Store store;
}
