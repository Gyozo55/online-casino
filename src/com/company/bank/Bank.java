package com.company.bank;

public abstract class Bank {
    protected double balance;
    private BankType type;

    public Bank(double balance, BankType type) {
        this.balance = balance;
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void addBalance(double balance){
        this.balance+=balance;
    }
}
