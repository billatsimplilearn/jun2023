package com.simplilearn;

import java.util.ArrayList;

public class ShoppingCart {
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