package com.vitaran.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Store implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 16543L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String name;
	private Address address;
	
	@OneToMany
	private List<Product> product;
	
	@ManyToOne
	@JoinColumn(name = "category_id", referencedColumnName = "id")
	private Category category;
}
