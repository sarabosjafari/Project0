package com.project0.bankapp;

public class User {
    private String Name;
    private String Password;
    private int AccountID;

    public User(String Name, String password, int Account) {
        this.Name = Name;
        this.Password = password;
        this.AccountID = Account;
    }

    public User() {}

        public String getName() {
            return Name;
        }

        public void setName (String Name){
            Name = Name;
        }

        public String getPassword() {
            return Password;
        }

        public void setPassword (String Password){
            this.Password = Password;
        }

        public int getAccountID () {
            return AccountID;
        }

        public void setAccountID ( int accountID){
            AccountID = accountID;
        }

}