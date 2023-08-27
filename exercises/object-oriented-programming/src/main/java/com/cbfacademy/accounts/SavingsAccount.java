package com.cbfacademy.accounts;

public class SavingsAccount extends Account {
    protected double interest;

    public SavingsAccount (double balance, long accountNumber) {
        super (balance, accountNumber);
 
    }
    //method to add interest to balance 
    public void addInterest() {
        interest = balance * 0.1;
        balance += interest;
 }



}
