package com.simplilearn.groceryStore;


//1:M -> 1 store has many products
public class Product {

	private String name;
	private double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return name + " - $" + price;
	}
}
