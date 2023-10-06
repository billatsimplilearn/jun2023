package com.simplilearn;

import java.util.ArrayList;
import java.util.List;

// 1:M -> 1 store has many products
class Product {
    private String name;
    private double price;
    
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return name + " - $" + price;
    }
}

//1:M -> 1 store has many employees
class Employee {
    
	private int empId;
    private String empName;
    
    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }
    
    @Override
    public String toString() {
        return empId + " - " + empName;
    }
}

class GroceryStore {
	
    private String name;
    private List<Product> products;
    private List<Employee> employees;
    
    public GroceryStore(String name) {
        this.name = name;
        this.products = new ArrayList<>();
        this.employees = new ArrayList<>();       
    }
    
    public void addProduct(Product product) {
        products.add(product);
    }
    
    public void listProducts() {
        System.out.println("Products available at " + name + ":");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    private void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
    	employees.add(employee);	
	}
    
	private void listEmployees() {
		// TODO Auto-generated method stub
		
		  System.out.println("\nEmployees work at " + name + ":");
	        for (Employee employee : employees) {
	            System.out.println(employee);
	        }
		
	}	
	
		public static void main(String[] args) {
			
        GroceryStore store = new GroceryStore("Best Grocery Store");
        
        store.addProduct(new Product("Apples", 1.99));
        store.addProduct(new Product("Milk", 2.49));
        store.addProduct(new Product("Bread", 1.29));
        store.addProduct(new Product("Steak", 8.75));
        store.listProducts();
        
        store.addEmployee(new Employee(111, "Tim, Manager"));
        store.addEmployee(new Employee(222, "Sam, Cashier"));      
        store.addEmployee(new Employee(333, "Mike, Shopkeeper"));        
        store.listEmployees();
        
    }

		
}