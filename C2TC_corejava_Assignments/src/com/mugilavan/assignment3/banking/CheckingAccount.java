package com.mugilavan.assignment3.banking;

//Subclass 2: CheckingAccount
class CheckingAccount extends Account {
 private double overdraftLimit = 5000; // overdraft allowed

 public CheckingAccount(int accountNumber, String accountHolder, double balance) {
     super(accountNumber, accountHolder, balance);
 }

 @Override
 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited " + amount + " into Checking Account.");
 }

 @Override
 public void withdraw(double amount) {
     if (balance + overdraftLimit >= amount) {
         balance -= amount;
         System.out.println("Withdrew " + amount + " from Checking Account.");
     } else {
         System.out.println("Overdraft limit exceeded!");
     }
 }

 @Override
 public double getBalance() {
     return balance;
 }
}