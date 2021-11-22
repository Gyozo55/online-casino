package com.company.game;

import com.company.bank.Bank;

import java.util.UUID;

public class Roulette extends Game{
    public Roulette(String name, Bank ownBank, UUID id, double dailyProfit, int amountOfPlayer) {
        super(name, ownBank, id, dailyProfit, amountOfPlayer);
    }
}
