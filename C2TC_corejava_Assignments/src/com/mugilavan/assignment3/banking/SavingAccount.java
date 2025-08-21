package com.mugilavan.assignment3.banking;

//Subclass 1: SavingsAccount
class SavingsAccount extends Account {
 private double interestRate = 0.03; // Example interest rate

 public SavingsAccount(int accountNumber, String accountHolder, double balance) {
     super(accountNumber, accountHolder, balance);
 }

 @Override
 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited " + amount + " into Savings Account.");
 }

 @Override
 public void withdraw(double amount) {
     if (balance >= amount) {
         balance -= amount;
         System.out.println("Withdrew " + amount + " from Savings Account.");
     } else {
         System.out.println("Insufficient balance in Savings Account.");
     }
 }

 @Override
 public double getBalance() {
     return balance + (balance * interestRate); // return with interest
 }
}