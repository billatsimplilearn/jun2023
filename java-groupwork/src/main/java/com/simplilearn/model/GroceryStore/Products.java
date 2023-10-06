package com.simplilearn.model.GroceryStore;

public class Products {
	
	private int productId;
	private String productName;
	private String productDescription;
	private double productPrice;
	private String productImage;
	
	public Products(int productId,String productName,String productDescription,double productPrice, String productImage) {
		
		this.productId=productId;
		this.productName=productName;
		this.productDescription=productDescription;
		this.productPrice=productPrice;
		this.productImage=productImage;
		
		
	}

}
