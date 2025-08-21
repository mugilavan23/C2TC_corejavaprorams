package com.mugilavan.assignment1.employees;

/**
 * Manager class extends Employee.
 * Adds a department attribute specific to managers.
 */
public class Manager extends Employee {

    // Private attribute
    private String department;

    // Constructor
    public Manager(String name, String employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Setter for department
    public void setDepartment(String department) {
        this.department = department;
    }
}