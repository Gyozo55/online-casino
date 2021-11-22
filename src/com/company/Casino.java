package com.company;

import com.company.bank.BankType;
import com.company.bank.CasinoBank;
import com.company.game.Game;

import java.util.ArrayList;
import java.util.List;

public class Casino {
    CasinoBank casinoBank = new CasinoBank(10000.000, BankType.CASINOBANK);
    private List<Game> gameTalbes = new ArrayList<>();

    public void addGame(Game game){
        gameTalbes.add(game);
    }

    public double calculateProfit(){
        double dailyProfit = 0;
        for(Game game: gameTalbes){
            game.getOwnBank().addBalance(game.getDailyInCome() - game.getTotalCost());
            dailyProfit += game.getOwnBank().getBalance();
        }
        return dailyProfit;
    }

    public double calculateTotalBalance(){
        double totalBalance;
        for(Game game: gameTalbes){
            casinoBank.addBalance(game.getOwnBank().getBalance());
        }
        totalBalance = casinoBank.getBalance();
        return totalBalance;
    }
}
