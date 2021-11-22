package com.company.game;

import com.company.bank.Bank;

import java.util.UUID;

public class BlackJack extends Game{
    public BlackJack(String name, Bank ownBank, UUID id, double dailyProfit, int amountOfPlayer) {
        super(name, ownBank, id, dailyProfit, amountOfPlayer);
    }
}
