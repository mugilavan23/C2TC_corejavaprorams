package com.mugilavan.assignment2.sales;

import java.util.Scanner;

/**
 * Commission class represents a sales employee
 */
public class Commission {

    // Data members
    private String name;
    private String address;
    private String phone;
    private double salesAmount;

    /**
     * Method to accept details of the sales employee
     */
    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine();

        System.out.print("Enter Phone: ");
        phone = sc.nextLine();

        System.out.print("Enter Sales Amount: ");
        salesAmount = sc.nextDouble();
    }

    /**
     * Method to calculate commission based on sales amount
     */
    public double calculateCommission() {
        double commission = 0;

        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10; // 10%
        } else if (salesAmount >= 50000) {
            commission = salesAmount * 0.05; // 5%
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.03; // 3%
        } else {
            commission = 0; // No commission
        }

        return commission;
    }

    /**
     * Method to display employee details and commission
     */
    public void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Sales Amount: " + salesAmount);
        System.out.println("Commission: " + calculateCommission());
    }
}