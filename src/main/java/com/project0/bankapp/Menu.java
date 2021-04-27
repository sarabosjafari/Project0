package com.project0.bankapp;

import com.project0.bankappDAO.LoginDAO;
import com.project0.bankappDAO.LoginDAOImp;
import com.project0.bankappDAO.UserDAO;
//import org.apache.log4j.Logger;
import java.util.Scanner;
// import com.project0.bankapp.System;
import java.lang.System;




public class Menu {


    private static Object User;
    //private static Logger log = Logger.getLogger(Menu.class);
    private int Transaction;

    public static void main(String[] args) {

        // log.info("***Begin execution*********");

        //log.trace("Hello from TRACE");
        // log.debug("Hello from DEBUG");
        // log.info("Hello from INFO");
        //log.warn("Hello from WARN");
        //log.error("Hello from ERROR");
        //log.fatal("Hello from FATAL");


        System.out.println("This is Sara's bank app");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("the name entered by user:" + name);
        System.out.println("Enter your password");
        String password = sc.nextLine();
        try {
            LoginDAO loginDAO= new LoginDAOImp();
            User user= loginDAO.getUserByNameAndPassword(name, password);
            if (user!= null) {
                System.out.println("You are logged in");
                Menu menu=new Menu();
                menu.showMenu();
            }
        } catch (NumberFormatException e) {
            System.out.println("It is the wrong password or username");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void showMenu() {
        Scanner sc1 = new Scanner(System.in);
        double balance = 0;
        String Name;
        double deposit;
        double Transaction;



        System.out.println("Please choose an option");
        System.out.println("============================");
        System.out.println("1)Create an account");
        System.out.println("2)Make a deposit");
        System.out.println("3)Make a withdrawal");
        System.out.println("4)Show the balance");
        System.out.println("5)Exit");
        int option;
        do {

            System.out.println("Enter an option");
            option= sc1.nextInt();


            switch (option) {
                case 1:
                    System.out.println("Create an account");
                    int Account = sc1.nextInt();
                    break;
                case 2:
                    System.out.println("Enter an amount to deposit");
                    double amount = sc1.nextInt();
                    deposit=amount;
                    break;

                case 3:
                    System.out.println("Enter an amount to withdraw");
                    amount = sc1.nextInt();
                    withdraw(amount);
                case 4:
                    System.out.println("Balance=" + balance);
                    balance = sc1.nextDouble();
            }
        } while (option!= 5);
        System.out.println("Thank you");
    }




    private void withdraw(double amount) {
        double balance=0;


    if(amount!=0){
        balance=balance-amount;
        double transaction = -amount;
    }


   // private void createAnAccount(); {
    Scanner sc1 = new Scanner(System.in);
        String Name, Account = null;
        boolean valid=false;
        while(valid)
        System.out.println("Please enter an Account(Checking/Saving");
        Account=sc1.nextLine();
        if (Account.equals("Checking")||Account.equals("Saving")){
        valid=true;
        }
        else System.out.println("Invalid account type selected");
        }




     private void deposit(double amount){
    double balance = 0;double transaction;
        if (amount!=0){
        balance=balance+amount;
        transaction=amount;
        }
        }


        private void Transaction(){
    if(Transaction>0){
        System.out.println("Deposited:"+Transaction);
        }
    else if (Transaction<0){
        System.out.println("Withdraw:"+Math.abs(Transaction));
    }
    else {
        System.out.println("No transactions has been made");

        }
        }
}






                    //log.info("***End execution*********");}





















