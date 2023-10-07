package com.simplilearn.model.GroceryStore;

public class PaymentPage {

	private int orderId;
	private Customer customer;
	private double creditCard;
	private Address billingAddress;

	public PaymentPage(int orderId, Customer customer, double creditCard, Address billingAddress) {

		this.orderId = orderId;
		this.customer = customer;
		this.creditCard = creditCard;
		this.billingAddress = billingAddress;
	}

}
