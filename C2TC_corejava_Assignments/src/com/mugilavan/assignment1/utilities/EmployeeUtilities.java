package com.mugilavan.assignment1.utilities;

// Import Employee class
import com.mugilavan.assignment1.employees.Employee;

/**
 * Utility class to perform operations on Employee objects.
 */
public class EmployeeUtilities {

    // Prints employee details
    public static void printEmployeeDetails(Employee emp) {
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Salary: " + emp.getSalary());
    }

    // Increases salary by a given percentage
    public static void increaseSalary(Employee emp, double percentage) {
        double newSalary = emp.getSalary() + (emp.getSalary() * (percentage / 100));
        emp.setSalary(newSalary);
    }
}