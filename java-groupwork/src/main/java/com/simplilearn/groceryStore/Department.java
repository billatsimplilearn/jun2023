package com.simplilearn.groceryStore;

import java.util.List;

public class Department {
	
	private String name;
	private Department parent; // One to self because it is the same class
	
	private List<Department> subDepartments;
	private List<Category> categories; // department has many categories


	public Department(String name) {
		this.name = name;
	}


}
