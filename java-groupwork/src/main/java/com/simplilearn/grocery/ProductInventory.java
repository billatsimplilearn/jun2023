package com.simplilearn.grocery;

public class ProductInventory {
	private String pid;
	private int productQuantity;
	
	public ProductInventory(String pid, int productQuantity) {
		this.pid = pid;
		this.productQuantity = productQuantity;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	@Override
	public String toString() {
		return "ProductInventory [pid=" + pid + ", productQuantity=" + productQuantity + "]";
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	

}
