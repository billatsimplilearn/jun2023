package com.simplilearn.model.GroceryStore;

import java.util.List;

public class Customer extends User {

	private int userId;
	private int password;
	private String userName;
	private String emailAddress;
	

	public Customer(int userId, int password, String userName, String emailAddress) {
		super(userId, password, userName, emailAddress);
	}

}
