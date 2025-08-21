package com.mugilavan.assignment1.employees;

/**
 * Developer class extends Employee.
 * Adds programmingLanguage attribute specific to developers.
 */
public class Developer extends Employee {

    // Private attribute
    private String programmingLanguage;

    // Constructor
    public Developer(String name, String employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Getter for programmingLanguage
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    // Setter for programmingLanguage
    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}