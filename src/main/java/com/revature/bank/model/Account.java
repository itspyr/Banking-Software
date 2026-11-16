package com.revature.bank.model;

public class Account {
    private int accountNumber;
    private double accountBalance;
    private String status;
    private String accountType;
    private int customerId;

    public Account(int accountNumber, double accountBalance, String status, String accountType, int customerId) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.status = status;
        this.accountType = accountType;
        this.customerId = customerId;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAccountType() {
        return accountType;
    }

    public int getCustomerId() {
        return customerId;
    }
}
