package com.project0.bankapp;

public class Employee extends User {

    private int Account;
    private int EmployeeId;

    Employee(String Name, String password, int Account, int EmployeeId) {
        super(Name, password, Account);
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }



}
