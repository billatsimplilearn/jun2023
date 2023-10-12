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
		
		System.out.println("POroduct Inventory List: " + productInventory);
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
	
	public void UpdateProductQuantity (int productQty) {
		
	}
 
}
