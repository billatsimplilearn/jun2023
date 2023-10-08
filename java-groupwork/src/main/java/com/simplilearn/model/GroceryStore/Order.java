package com.simplilearn.model.GroceryStore;

import java.time.LocalDate;
import java.util.List;

public class Order {

	private int orderId;
	private List<Product> product;
	private List<Customer> customerdata;
	private LocalDate orderDate;
	private Address Address;
	private double orderTotal;

	public Order(int orderId, List<String> product, List<String> customerdata, LocalDate orderDate, Address Address,
			double orderTotal) {

		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderTotal = orderTotal;

	}

}
