package com.project0.bankapp;

public class Transaction {
   private double transactionID;
   private int accountID;
   private int balance;
   private double amount;

   public double getAmount() {
      return amount;
   }

   public void setAmount(double amount) {
      this.amount = amount;
   }

   public String getTransactionsType() {
      return TransactionsType;
   }

   public double getBalance() {
      return balance;
   }

   public void setBalance(int balance) {
      balance = balance;
   }

   public double getAccountID() {
      return accountID;
   }

   public void setAccountID(int accountID) {
      accountID = accountID;
   }

   public void setTransactionsType(String transactionsType) {
      TransactionsType = transactionsType;
   }

   private String TransactionsType;

   public double getTransactionID() {
      return transactionID;
   }

   public void setTransactionID(double transactionID) {
      this.transactionID = transactionID;
   }
}
