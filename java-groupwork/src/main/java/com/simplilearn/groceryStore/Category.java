package com.simplilearn.groceryStore;

import java.util.List;

public class Category {
	private String name;
	private Category parentCategory;  // One to self because it is the same class	
	private List <Category> subCategories; // one to self
	
	
	public Category (String name) {
		this.name = name;
	}
	
	public void addSupercategory (Category clothes) {
		this.parentCategory = clothes;
	}

		

}
