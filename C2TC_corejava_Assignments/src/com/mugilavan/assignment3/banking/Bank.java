package com.mugilavan.assignment3.banking;
//Assignment 3 - Banking Transaction System
//Demonstrating static, abstract, and final usage in Java

//================== 1. STATIC DEMO ==================
class Bank {
 // Static variable to keep track of total accounts across all objects
 private static int totalAccounts = 0;

 // Constructor -> every time a new account is created, increase total accounts
 public Bank() {
     totalAccounts++;
 }

 // Static method to return the current total accounts
 public static int getTotalAccounts() {
     return totalAccounts;
 }
}