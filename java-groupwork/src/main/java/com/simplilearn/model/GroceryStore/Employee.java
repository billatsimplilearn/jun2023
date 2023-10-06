package com.simplilearn.model.GroceryStore;

public class Employee extends User {
	
	private int userId;
	private int password;
	private String userName;
	private String emailAddress;
	
	public Employee(int userId, int password, String userName, String emailAddress) {
		super(userId,password,userName,emailAddress);
	}

}
