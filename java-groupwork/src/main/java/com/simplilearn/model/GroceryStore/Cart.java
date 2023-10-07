package com.simplilearn.model.GroceryStore;

import java.util.List;

public class Cart {

	private Customer customer;
	private List<String> products;

	public Cart(Customer customer, List<String> products) {
		this.customer = customer;
		this.products = products;

	}

}
