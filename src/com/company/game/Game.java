package com.company.game;

import com.company.bank.Bank;

import java.util.UUID;

public abstract class Game {
    private String name;
    private Bank ownBank;
    private UUID id;
    private double dailyProfit;
    private int amountOfPlayer;

    public Game(String name, Bank ownBank, double dailyProfit, int amountOfPlayer) {
        setId();
        this.name = name;
        this.ownBank = ownBank;
        this.id = id;
        this.dailyProfit = dailyProfit;
        this.amountOfPlayer = amountOfPlayer;
    }

    public String getName() {
        return name;
    }

    public Bank getOwnBank() {
        return ownBank;
    }

    public UUID getId() {
        return id;
    }

    public double getDailyProfit() {
        return dailyProfit;
    }

    public int getAmountOfPlayer() {
        return amountOfPlayer;
    }

    private void setId(){
        this.id = UUID.randomUUID();
    }
}
