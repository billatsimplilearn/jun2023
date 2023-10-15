package com.simplilearn.groceryStore;

import java.util.ArrayList;
import java.util.List;

public class GroceryStore {

	private List<Employee> employees;
	private List<Vendor> vendors;
	private List<Product> products;
	private List<Department> departments;
	private List<Category> categories;

	public GroceryStore() {

		this.employees = new ArrayList<>();
		this.vendors = new ArrayList<>();
		this.products = new ArrayList<>();
		this.departments = new ArrayList<>();
		this.categories = new ArrayList<>();

	}

	public static void main(String [] args) {
		
		Category clothes = new Category("clothes");

	}

}