package com.project0.bankapp;

public class Customer extends User {

    private int Account;

    Customer(String Name, String password, int Account) {
        super(Name, password, Account);
    }

    public int getAccount() {
        return Account;
    }

    public void setAccount(int account) {
        Account = account;
    }
}

