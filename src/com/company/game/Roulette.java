package com.company.game;

import com.company.bank.GameBank;
import com.company.employee.Dealer;
import com.company.employee.Experience;

public class Roulette extends Game{
    private static final int maxAmountOfPlayers = 8;
    private static final double dailyProfit = 2000.000;
    private Dealer dealer;
    private final Experience minimumExperience = Experience.PRO;

    public Roulette(GameBank ownBank, Dealer dealer) throws Exception{
        super(ownBank, dailyProfit, dealer.getDailySalary(Experience.PRO), maxAmountOfPlayers);
        if(dealer.getExperience().equals(minimumExperience)) {
            this.dealer = dealer;
        }
        else { throw new Exception("Roulette only run by Pro Dealer!");}
    }

    public Dealer getDealer() {
        return dealer;
    }
}
