package com.company.bank;

public class CasinoBank extends Bank{
    public CasinoBank(double balance, BankType type) {
        super(balance, type);
    }

    public void addGameBankBalance(double balance){
        super.balance+=balance;
    }
}
