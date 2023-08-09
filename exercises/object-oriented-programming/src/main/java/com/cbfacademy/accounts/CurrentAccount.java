package com.cbfacademy.accounts;

public class CurrentAccount extends Account {
    protected double overdraftLimit;
    protected double withdrawable;

    public CurrentAccount (double balance, long accountNumber, double overdraftLimit) {
        super (balance, accountNumber);
        this.overdraftLimit = overdraftLimit;
        
    }

    // if overdraftLimit has been reached, can't withdraw
    @Override 
    public void withdraw (double amount) {
        withdrawable = overdraftLimit + balance;
        if (withdrawable <=0 || amount > withdrawable) {
            System.out.println("Not enough balance");
        } else if (amount <= 0) {
            System.out.println("Invalid amount to withdraw");
        } else {
            System.out.println("Withdrawable is" + withdrawable);
            withdrawable = withdrawable - amount;
            balance = balance - amount;
        // set balance
        }
        }  
         

        
    }

