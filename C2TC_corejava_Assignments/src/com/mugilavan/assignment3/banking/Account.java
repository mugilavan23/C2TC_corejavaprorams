package com.mugilavan.assignment3.banking;

//================== 2. ABSTRACT CLASS DEMO ==================
abstract class Account {
 protected int accountNumber;
 protected String accountHolder;
 protected double balance;

 // Constructor for common account details
 public Account(int accountNumber, String accountHolder, double balance) {
     this.accountNumber = accountNumber;
     this.accountHolder = accountHolder;
     this.balance = balance;
 }

 // Abstract methods -> must be implemented by subclasses
 public abstract void deposit(double amount);
 public abstract void withdraw(double amount);
 public abstract double getBalance();

 // Concrete method -> common to all accounts
 public void displayAccountInfo() {
     System.out.println("Account No: " + accountNumber +
                        ", Holder: " + accountHolder +
                        ", Balance: " + balance);
 }
}