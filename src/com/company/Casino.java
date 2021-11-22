package com.company;

import com.company.bank.BankType;
import com.company.bank.CasinoBank;
import com.company.game.Game;

import java.util.ArrayList;
import java.util.List;

public class Casino {
    CasinoBank casinoBank = new CasinoBank(10000.000, BankType.CASINOBANK);
    private final List<Game> gameTables = new ArrayList<>();

    public void addGame(Game game){
        gameTables.add(game);
    }

    public double calculateProfit(){
        double dailyProfit = 0;
        for(Game game: gameTables){
            game.addBankBalance(game.getDailyInCome() - game.getTotalCost());
            dailyProfit += game.getBankBalance();
        }
        return dailyProfit;
    }

    public double calculateTotalBalance(){
        double totalBalance;
        for(Game game: gameTables){
            casinoBank.addBalance(game.getBankBalance());
        }
        totalBalance = casinoBank.getBalance();
        return totalBalance;
    }
}
