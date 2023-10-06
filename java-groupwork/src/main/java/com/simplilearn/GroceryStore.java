package com.simplilearn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GroceryStore {
    private String name;
    private Address address;
    private Manager manager;
    private List<Product> products;
    private List<Customer> customers;

    // Constructors, getters, and setters

    // One-to-one relationship with Manager
    public void setManager(Manager manager) {
        this.manager = manager;
    }

    // One-to-many relationship with Product
    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    // One-to-many relationship with Customer
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }




    
    public static void main (String [] args) {
    	
    	
    }
    
    
    
}

class Manager {
    private String name;
    private String contactNumber;
    // Other properties, getters, setters, etc.
}

class Product {
    private String name;
    private double price;
    // Other properties, getters, setters, etc.
}

class Customer {
    private String name;
    private String email;
    private List<Product> purchasedProducts; // Many-to-many relationship with Product

    // Constructors, getters, setters, etc.
}

class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    // Constructors, getters, setters, etc.
}
