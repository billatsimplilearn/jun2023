package Storage;

import java.util.ArrayList;

class Shelf {
    String shelfName;
    private ArrayList<String> items;

    public Shelf(String shelfName) {
        this.shelfName = shelfName;
        this.items = new ArrayList<>();
    }

    public void addItem(String itemName) {
        items.add(itemName);
    }

    public void restockShelf(ArrayList<String> newItems) {
        items.addAll(newItems);
    }

    public ArrayList<String> getItems() {
        return items;
    }
}

// Store class to manage multiple shelves and restocking
class GroceryStore {
    private ArrayList<Shelf> shelves;

    public GroceryStore() {
        this.shelves = new ArrayList<>();
    }

    public void addShelf(Shelf shelf) {
        shelves.add(shelf);
    }

    public void restockStore(String shelfName, ArrayList<String> newItems) {
        for (Shelf shelf : shelves) {
            if (shelf.shelfName.equals(shelfName)) {
                shelf.restockShelf(newItems);
                System.out.println("Restocked shelf '" + shelfName + "' with " + newItems.size() + " items.");
                return;
            }
        }
        System.out.println("Shelf '" + shelfName + "' not found in the store.");
    }
}

public class Storage {
    public static void main(String[] args) {
        // Create a grocery store
        GroceryStore store = new GroceryStore();

        // Create shelves and add them to the store
        Shelf shelf1 = new Shelf("Fruits");
        Shelf shelf2 = new Shelf("Vegetables");
        store.addShelf(shelf1);
        store.addShelf(shelf2);

        // Restock the "Fruits" shelf
        ArrayList<String> newItems = new ArrayList<>();
        newItems.add("Apples");
        newItems.add("Bananas");
        store.restockStore("Fruits", newItems);

        // Check the items on the "Fruits" shelf
        ArrayList<String> fruitsOnShelf = shelf1.getItems();
        System.out.println("Items on the 'Fruits' shelf: " + fruitsOnShelf);
    }
}
