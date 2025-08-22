package inheritance_assignment.main;

import inheritance_assignment.items.Book;
import inheritance_assignment.items.Magazine;
import inheritance_assignment.library.Library;

/**
 * Main class for Assignment 3
 */
public class Assignment3Main {
    public static void main(String[] args) {
        
        // Part A - Inheritance demonstration
        Book book = new Book(101, "Java Basics", "James Gosling");
        Magazine magazine = new Magazine(201, "Tech Today", 45);

        // Show individual details
        System.out.println("=== Inheritance Demo ===");
        book.displayInfo();
        magazine.displayInfo();

        // Part B - Composition demonstration
        Library library = new Library();
        library.addItem(book);
        library.addItem(magazine);

        System.out.println("\n=== Composition Demo ===");
        library.showAllItems();
    }
}