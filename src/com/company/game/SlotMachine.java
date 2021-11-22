package com.company.game;

import com.company.bank.GameBank;

import java.util.concurrent.ThreadLocalRandom;

public class SlotMachine extends Game{
    private static final int maxAmountOfPlayers = 1;
    private static final int totalCost = 0;
    private static final double dailyProfit = 1000.000;
    private int currentNumberOfRolls = 0;
    private int rollsAfterLastWin = 0;

    public SlotMachine(GameBank ownBank) {
        super(ownBank, dailyProfit ,totalCost, maxAmountOfPlayers);
    }
    public void roll(){
        int currentWinChance = ThreadLocalRandom.current().nextInt(0, 10 + 1);
        if(currentWinChance == 5){
            this.rollsAfterLastWin = 0;
            this.currentNumberOfRolls += 1;
        }
        this.rollsAfterLastWin += 1;
        this.currentNumberOfRolls += 1;
    }

    public int getCurrentNumberOfRolls() {
        return currentNumberOfRolls;
    }

    public int getRollsAfterLastWin() {
        return rollsAfterLastWin;
    }
}
