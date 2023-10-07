package com.simplilearn;
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

	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        ShoppingCart cart = new ShoppingCart();

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

    

