package com.project0.bankapp;

public class Account {
    private String Name;
    private double Balance;
    private int AccountID;

    public int getAccountID() {
        return AccountID;
    }

    public void setAccountID(int accountID) {
        AccountID = accountID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    private int accountNumber;
    // private int[] TransactionID;


    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return Balance;

    }

    public void setBalance(double balance) {
        this.Balance = balance;
    }

    public double getAccountNumber() {
        return accountNumber;

    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

   /* public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("You do not have enough money");
            return;
            System.out.println("You have withdrawn:" + amount);

        }
    }

        /* public void deposit(double Amount){
            if (amount < 0)
                System.out.println("You can not deposit negative funds");
            return;
            balance = +amount;
            System.out.println("You have deposited $" + amount);
            System.out.println("You have $" + balance);

        }
    }*/
}
        //public int[] getTransactionID(){
         //   return TransactionID;
       // }

       /* public void setTransactionID ( int[] transactionID){
            TransactionID = transactionID;
        }*/

