package com.rogerio.ProductService.models;


public class ProductOrdered {
	
	private Long id;
	private String name;
	private int quantity;

	
	public ProductOrdered() {	}


	public ProductOrdered(Long id, String name, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
}
