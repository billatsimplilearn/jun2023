package com.simplilearn.model.GroceryStore;

public abstract class User {

	private int userId;
	private int password;
	private String userName;
	private String emailAddress;

	public User(int userId, int password, String userName, String emailAddress) {

		this.userId = userId;
		this.password = password;
		this.userName = userName;
		this.emailAddress = emailAddress;
	}

	public String toString() {
		
		StringBuilder str = new StringBuilder();
		str.append(userId);
		str.append(",");
		str.append(userName);
		str.append(",");
		str.append(emailAddress);
	
		return str.toString();
		
	}
}
