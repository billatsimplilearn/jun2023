package com.simplilearn.grocery;

public class Product {
	private String pid;
	private String productName;
	private double productPrice;
	
	public Product(String pid,String productName, double productPrice) {
		this.pid = pid;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", productName=" + productName + ", productPrice=" + productPrice + "]";
	}
	
	public void addProduct() {
		
	}
	
}
