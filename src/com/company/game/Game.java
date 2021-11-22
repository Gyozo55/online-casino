package com.company.game;

import com.company.bank.Bank;
import com.company.bank.GameBank;

import java.util.UUID;

public abstract class Game {
    private final GameBank ownBank;
    private final UUID id;
    private final double dailyInCome;
    private final double totalCost;
    private final int amountOfPlayer;

    public Game(GameBank ownBank, double dailyProfit, double totalCost, int amountOfPlayer) {
        this.totalCost = totalCost;
        this.id = UUID.randomUUID();
        this.ownBank = ownBank;
        this.dailyInCome = dailyProfit;
        this.amountOfPlayer = amountOfPlayer;
    }

    public Bank getOwnBank() {
        return ownBank;
    }

    public double getDailyInCome() {
        return dailyInCome;
    }

    public double getTotalCost() {
        return totalCost;
    }
}
