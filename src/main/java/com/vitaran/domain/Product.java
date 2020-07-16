package com.vitaran.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	private String discrition;
	private String brand;
	
	@ManyToOne
    @JoinColumn(name = "store_id", referencedColumnName = "id")
    private Store store;
}
