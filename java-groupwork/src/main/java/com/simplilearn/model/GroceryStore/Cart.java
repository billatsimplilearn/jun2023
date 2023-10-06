package com.simplilearn.model.GroceryStore;

import java.util.List;

public class Cart {

	private Customer customer;
	private List<Products> products;
	
	public Cart(Customer customer,List<Products> products ) {
		this.customer=customer;
		this.products=products;
		
	}
	
}
