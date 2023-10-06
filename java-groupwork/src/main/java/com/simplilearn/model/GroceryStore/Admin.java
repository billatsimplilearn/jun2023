package com.simplilearn.model.GroceryStore;

public class Admin extends User{
	
	private int userId;
	private int password;
	private String userName;
	private String emailAddress;
	
	public Admin(int userId, int password, String userName, String emailAddress) {
		super(userId,password,userName,emailAddress);
		
		
	}
	
	
	

}
