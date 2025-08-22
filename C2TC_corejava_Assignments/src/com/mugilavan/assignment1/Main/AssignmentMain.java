package com.mugilavan.assignment1.Main;

// Import classes
import com.mugilavan.assignment1.employees.Manager;
import com.mugilavan.assignment1.employees.Developer;
import com.mugilavan.assignment1.utilities.EmployeeUtilities;

/**
 * Main class to run Assignment 1
 */
public class AssignmentMain {

    public static void main(String[] args) {

        // Create Manager
        Manager manager = new Manager("Alice", "M101", 80000, "HR");

        // Create Developer
        Developer developer = new Developer("Bob", "D202", 60000, "Java");

        // Print initial details
        System.out.println("=== Manager Details ===");
        EmployeeUtilities.printEmployeeDetails(manager);
        System.out.println("Department: " + manager.getDepartment());

        System.out.println("\n=== Developer Details ===");
        EmployeeUtilities.printEmployeeDetails(developer);
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());

        // Increase salary
        EmployeeUtilities.increaseSalary(manager, 10);
        EmployeeUtilities.increaseSalary(developer, 15);

        // Print updated details
        System.out.println("\n=== After Salary Increment ===");
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);
    }
}