package com.simplilearn.grocery;

public class Cart {
	private Product product;
	private int quantityPurchased;
	
	public Cart (Product product, int quantity) {
		this.product = product;
		this.quantityPurchased = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public int getQuantity() {
		return quantityPurchased;
	}
	
	public double getTotalPrice() {
		return product.getProductPrice() * quantityPurchased;
	}
}