package com.company.game;

import com.company.bank.GameBank;
import com.company.employee.Dealer;
import com.company.employee.Experience;

public class BlackJack extends Game{
    private static final int maxAmountOfPlayers = 6;
    private static final double dailyProfit = 1000.000;
    private Dealer dealer;
    public BlackJack(GameBank ownBank, Dealer dealer) {
        super(ownBank, dailyProfit, dealer.getDailySalary(dealer.getExperience()), maxAmountOfPlayers);
        this.dealer = dealer;
    }
    public Dealer getDealer() {
        return dealer;
    }
}
