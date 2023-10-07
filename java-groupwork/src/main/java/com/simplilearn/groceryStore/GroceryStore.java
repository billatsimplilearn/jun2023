package com.simplilearn.groceryStore;

import java.util.ArrayList;
import java.util.List;

public class GroceryStore {

	private List<Product> products;
	private List<Employee> employees;

	public GroceryStore() {

		this.products = new ArrayList<>();
		this.employees = new ArrayList<>();
	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public void listProducts() {
		System.out.println("Products available at My Grocery Store:");
		System.out.println("Product " + " Price " );
		for (Product product : products) {
			System.out.println(product);
		}
	}

	private void addEmployee(Employee employee) {

		employees.add(employee);
	}

	private void listEmployees() {

		System.out.println("\nEmployees work at My Grocery Store:");
		System.out.println("EmpID " + " Name " + " Role");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

	public static void main(String[] args) {

		GroceryStore store = new GroceryStore();
		
		store.addProduct(new Product("Apples", 1.99));
		store.addProduct(new Product("Milk", 2.49));
		store.addProduct(new Product("Bread", 1.29));
		store.addProduct(new Product("Steak", 8.75));
		store.listProducts();
		
		store.addEmployee(new Employee(111, "Tim", "Manager"));
		store.addEmployee(new Employee(222, "Sam", "Cashier"));
		store.addEmployee(new Employee(333, "Mike", "Shopkeeper"));
		store.listEmployees();

	}

}