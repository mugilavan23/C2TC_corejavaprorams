package com.mugilavan.assignment3.banking;
//================== 3. FINAL DEMO ==================
final class Transaction {
 // final variable -> cannot be changed once initialized
 private final double transactionFee = 10.0;

 // final method -> cannot be overridden by subclasses
 public final void performTransaction(Account account, double amount, String type) {
     System.out.println("Processing transaction...");
     if (type.equalsIgnoreCase("deposit")) {
         account.deposit(amount);
         account.withdraw(transactionFee); // Deduct fee
     } else if (type.equalsIgnoreCase("withdraw")) {
         account.withdraw(amount + transactionFee); // Deduct fee with withdrawal
     }
     System.out.println("Transaction completed. Current Balance: " + account.getBalance());
 }
}