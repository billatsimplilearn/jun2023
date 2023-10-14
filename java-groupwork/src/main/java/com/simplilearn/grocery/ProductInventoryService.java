package com.simplilearn.grocery;

import java.util.HashMap;
import java.util.Map;

public class ProductInventoryService {
	public Map<String, ProductInventory> productInventory;

	public ProductInventoryService() {
		productInventory = new HashMap<String, ProductInventory>();
	}

	public void addProductInventory(ProductInventory prodInventory) {
		productInventory.put(prodInventory.getPid(), prodInventory);
	}
	
	public ProductInventory searchProductInventory(String pid) {
		String notFoundSearchMsg = "Product " + pid + "  was NOT FOUND in Product Inventory";
		String foundSearchMsg = "Product " + pid + " was FOUND in Product Inventory";

		ProductInventory productFound = productInventory.get(pid);
		if (productFound != null) {
			System.out.println(foundSearchMsg);
			System.out.println(productFound);
		} else {
			System.out.println(notFoundSearchMsg);
		}
		return productFound;
	}

	public void displayProductInventory() {

		for (Map.Entry<String, ProductInventory> entry : productInventory.entrySet()) {
			System.out.println("Product ID: " + entry.getKey());
			System.out.println("Product Available Quantity: " + entry.getValue());
		}
	}
	
	public int getAvailableProductInventory(String pid) {
		ProductInventory pI = searchProductInventory(pid);
		int availableQuantity = pI.getProductQuantity();
		return availableQuantity;
	}
	
	public void addToShoppingCart(Product product, int quantityPurchased, ShoppingCart shoppingCart){
		String productId = product.getPid();
		//check if purchased quantity is less than quantity available
		if (isQuantityAvailable(product, quantityPurchased)) {
			//if so add to the cart for now
			shoppingCart.addItemToCart(product, quantityPurchased);
			//search for the product
			ProductInventory inventory = searchProductInventory(productId);
			//deduct the quantity purchased from quantity available
			int newQuantity = inventory.getProductQuantity() - quantityPurchased;
			inventory.setProductQuantity(newQuantity);
			System.out.println("Updated quantity available for product: "+productId+ " is "+ inventory.getProductQuantity());
		} else {
			throw new IllegalStateException("Quantity Unavailable for the selected product " + product + ", quantity purchased " + quantityPurchased);
		}
	}
 
	public boolean isQuantityAvailable(Product product, int quantityPurchased) {
		String productId = product.getPid();
		System.out.println("pid: "+ productId);
		int quantityAvailable = getAvailableProductInventory(productId);
		return (quantityAvailable > quantityPurchased);
	}
}
