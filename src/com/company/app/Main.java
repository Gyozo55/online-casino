package com.company.app;

import com.company.Casino;
import com.company.bank.BankType;
import com.company.bank.GameBank;
import com.company.employee.Dealer;
import com.company.employee.Experience;
import com.company.game.BlackJack;
import com.company.game.Roulette;
import com.company.game.SlotMachine;

public class Main {

    public static void main(String[] args) throws Exception {
        Casino casino = new Casino();
        BlackJack blackJack = new BlackJack(new GameBank(2000.000, BankType.GAMEBANK), new Dealer("Bála", Experience.MIDLEVEL));
        Roulette roulette = new Roulette(new GameBank(1000.000, BankType.GAMEBANK), new Dealer("Sári", Experience.PRO));
        SlotMachine slotMachine = new SlotMachine(new GameBank(500.000, BankType.GAMEBANK));

        casino.addGame(blackJack);
        casino.addGame(roulette);
        casino.addGame(slotMachine);

        System.out.println(casino.calculateProfit());
        System.out.println(casino.calculateTotalBalance());
    }
}
