package com.simplilearn.groceryStore;

import java.util.ArrayList;
import java.util.List;

//1:M -> 1 store has many products
public class Product {

	private String name;
	private double price;
	private int quantity;
	private Vendor vendor;
	
	private List <Category> category= new ArrayList<>();
	
	public Product() {

	}

	public Product(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		Category shoes = new Category("Shoes");
		Product casualShoes = new Product();
		casualShoes.name = "Casual Shoes";
		casualShoes.category.add(shoes);

		Category clothes = new Category("Clothes");
		shoes.addSupercategory(clothes);
		Category product = new Category("Product");
		clothes.addSupercategory(product);

		Category menClothes = new Category("Men Clothes");
		menClothes.addSupercategory(clothes);

		Product shirts = new Product();
		shirts.name = "Men Shirt";
		shirts.category.add(menClothes);
	}

}
