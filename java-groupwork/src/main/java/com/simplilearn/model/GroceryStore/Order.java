package com.simplilearn.model.GroceryStore;

import java.time.LocalDate;
import java.util.List;

public class Order {
	
	
	private int orderId;
	private List<Products> product;
	private List<Customer> customerdata;
	private LocalDate orderDate;
	private Address Address;
	private double orderTotal;
	
	public Order(int orderId,Products product,Customer customerdata,LocalDate orderDate,Address Address,double orderTotal) {
		
		this.orderId=orderId;
		this.orderDate=orderDate;
		this.orderTotal=orderTotal;
		
	}
	
	
	

}
