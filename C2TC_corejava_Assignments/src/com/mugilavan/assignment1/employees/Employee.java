// Package declaration
package com.mugilavan.assignment1.employees;

/**
 * Employee class represents a general employee.
 * Demonstrates encapsulation using private attributes with public/protected getters and setters.
 */
public class Employee {

    // Private attributes
    private String name;
    private String employeeId;
    private double salary;

    /**
     * Constructor to initialize Employee
     */
    public Employee(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for employeeId
    public String getEmployeeId() {
        return employeeId;
    }

    // Protected setter for employeeId (accessible by subclasses)
    protected void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
}