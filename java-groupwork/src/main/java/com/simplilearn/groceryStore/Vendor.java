package com.simplilearn.groceryStore;

public class Vendor {
	private String name;
	private int phoneNum;

	public Vendor(String name, int phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
		
	}


	@Override
	public String toString() {
		return name + " - " + phoneNum;
	}
	

}
