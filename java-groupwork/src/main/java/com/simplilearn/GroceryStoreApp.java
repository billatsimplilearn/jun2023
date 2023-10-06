package com.simplilearn;

import java.util.ArrayList;
import java.util.Scanner;


public class GroceryStoreApp {		


    private String name;
    private double price;
   
    public GroceryStoreApp() {
		
  	}
    
    public GroceryStoreApp(String name, double price) {
        this.name = name;
        this.price = price;
    }
  
	public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


class ShoppingCart {
    private ArrayList<GroceryStoreApp> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(GroceryStoreApp product) {
        items.add(product);
    }

    public void displayItems() {
        for (GroceryStoreApp item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (GroceryStoreApp item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
	
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GroceryStoreApp myOuter = new GroceryStoreApp();
        GroceryStoreApp.ShoppingCart cart = myOuter.new ShoppingCart();

        for ( ; ; ) {
            System.out.println("\nMenu");
            System.out.println("1. Add Product");
            System.out.println("2. Display Cart");
            System.out.println("3. Calculate Total");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.next();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    GroceryStoreApp product = new GroceryStoreApp(name, price);
                    cart.addItem(product);
                    break;
                case 2:
                    System.out.println("Cart List: ");
                    cart.displayItems();
                    break;
                case 3:
                    System.out.println("Total Cost: $" + cart.calculateTotal());
                    break;
                case 4:
                    System.out.println("Thank you for using the Grocery Store App!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

    

