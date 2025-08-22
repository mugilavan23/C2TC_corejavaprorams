package com.mugilavan.assignment3.banking;

//================== MAIN CLASS ==================
public class BankingDemo {
 public static void main(String[] args) {
     // Creating accounts increases Bank.totalAccounts
     Bank b1 = new Bank();
     Bank b2 = new Bank();

     System.out.println("Total accounts created: " + Bank.getTotalAccounts());

     // Create Savings Account
     Account savings = new SavingsAccount(101, "Alice", 5000);
     savings.displayAccountInfo();

     // Create Checking Account
     Account checking = new CheckingAccount(102, "Bob", 1000);
     checking.displayAccountInfo();

     // Transaction processing
     Transaction txn = new Transaction();
     txn.performTransaction(savings, 2000, "deposit");
     txn.performTransaction(checking, 1500, "withdraw");
 }
}