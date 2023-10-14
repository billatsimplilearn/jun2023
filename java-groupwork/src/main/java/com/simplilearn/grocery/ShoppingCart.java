package com.simplilearn.grocery;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Cart> cartItems;

	public ShoppingCart() {
		cartItems = new ArrayList<>();
	}

	public void addItemToCart(Product product, int quantityBought) {
		Cart item = new Cart(product, quantityBought);
		cartItems.add(item);
	}

	public List<Cart> getCartItems() {
		return cartItems;
	}

	public double calculateTotalPrice() {
		double totalPrice = 0;
		for (Cart item : cartItems) {
			totalPrice += item.getTotalPrice();
		}
		return totalPrice;
	}

	public void removeProduct(Cart product) {
		cartItems.remove(product);
	}
/**
	public boolean isQuantityAvailable(Product product, int quantityPurchased) {
		ProductInventoryService productInventorySvc = new ProductInventoryService(); // this is not connected
		String productId = product.getPid();
		System.out.println("pid: " + productId);
		int quantityAvailable = productInventorySvc.getAvailableProductInventory(productId);
		return (quantityAvailable > quantityPurchased);
	}
	
**/
}
