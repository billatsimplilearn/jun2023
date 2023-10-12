package com.simplilearn.grocery;

import java.util.HashMap;
import java.util.Map;

public class ProductService {

	public Map<String, Product> productList;

	public ProductService() {
			productList = new HashMap<String, Product>();
		}

	public void addProduct(Product product) {
		productList.put(product.getPid(), product);
	}

/**	public ProductInventory searchProductInventory(String pid) {

		String notFoundSearchMsg = "Product " + pid + "  was NOT FOUND in Product Inventory";
		String foundSearchMsg = "Product " + pid + " was FOUND in Product Inventory";
		System.out.println("product inventory in Search method: " + productInventory);
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
**/
	public void displayProducts() {

		for (Map.Entry<String, Product> entry : productList.entrySet()) {
			System.out.println("Product ID: " + entry.getKey());
			System.out.println("Product Available Quantity: " + entry.getValue());
		}
	}

/**	public int getAvailableProductInventory(String pid) {
		ProductInventory pI = searchProductInventory(pid);
		int availableQuantity = pI.getProductQuantity();
		return availableQuantity;
	}

	public void UpdateProductQuantity(int productQty) {

	}
**/
}
