package com.cbfacademy.accounts;

public class Account {
    protected double balance;
    protected long accountNumber;
    
    // constructor
    public Account (double balance, long accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    // account methods
    public double getBalance() {
        return this.balance;
    }

    public void deposit (double amount) {
        if (amount <=0) {
            System.out.println("Invalid deposit amount");
        } else {
        this.balance = this.balance + amount;
        }
    }

    public void withdraw (double amount) {
        if (this.balance <= 0 || amount > this.balance) {
            System.out.println("Not enough balance");
        } else if (amount <= 0) {
            System.out.println("Invalid amount to withdraw");
        }
        else {
        this.balance = this.balance - amount;
        }
    }

    @Override
    public String toString() {
        return "Account Number:" + accountNumber + "\n" + "Balance:" + balance;
    }
}
