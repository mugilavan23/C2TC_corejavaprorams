package com.mugilavan.assignment2.main;
//Import Student class from student package
import com.mugilavan.assignment2.student.Student;

//Import Commission class from sales package
import com.mugilavan.assignment2.sales.Commission;
/**
 * Main class to run Assignment 2
 */
public class Assignment2Main {

    public static void main(String[] args) {

        // Create Student object to test default constructor
        Student student = new Student();

        // Create Commission object
        Commission salesEmployee = new Commission();

        // Accept employee details
        salesEmployee.acceptDetails();

        // Display employee details and commission
        salesEmployee.displayDetails();
    }
}