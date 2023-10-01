package com.simplilearn;

import java.util.ArrayList;
import java.util.List;

class Product {
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

class GroceryStore {
    private String name;
    private List<Product> products;

    public GroceryStore(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void listProducts() {
        System.out.println("Products available at " + name + ":");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

	public class Main  {
    
		public static void Main(String[] args) {
        
        GroceryStore store = new GroceryStore("My Grocery Store");

        store.addProduct(new Product("Apples", 1.99));
        store.addProduct(new Product("Milk", 2.49));
        store.addProduct(new Product("Bread", 1.29));

        store.listProducts();
    }
}
