package inheritance_assignment.library;

import java.util.ArrayList;
import java.util.List;
import inheritance_assignment.items.Item;
/**
 * Library class (HAS-A relationship with Item)
 */
public class Library {
    private List<Item> items;

    // Constructor
    public Library() {
        items = new ArrayList<>();
    }

    // Method to add item
    public void addItem(Item item) {
        items.add(item);
    }

    // Method to show all items
    public void showAllItems() {
        System.out.println("\nLibrary contains:");
        for (Item item : items) {
            item.displayInfo();
        }
    }
}
