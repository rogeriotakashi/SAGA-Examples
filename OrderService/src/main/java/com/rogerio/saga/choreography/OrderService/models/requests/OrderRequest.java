package com.rogerio.saga.choreography.OrderService.models.requests;

import java.util.List;

import com.rogerio.saga.choreography.OrderService.models.ProductOrdered;

public class OrderRequest {
	
	private String user;
	private List<ProductOrdered> productsOrdered;
	private double total;
	
	public OrderRequest(String user, double total) {
		super();
		this.user = user;
		this.total = total;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	

	public List<ProductOrdered> getProductsOrdered() {
		return productsOrdered;
	}

	public void setProductsOrdered(List<ProductOrdered> productsOrdered) {
		this.productsOrdered = productsOrdered;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	
	
}
