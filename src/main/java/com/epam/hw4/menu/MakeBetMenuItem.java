package com.epam.hw4.menu;

import com.epam.hw4.Balance;
import com.epam.hw4.Horse;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class MakeBetMenuItem extends MenuItem {
    private List<Horse> horses;
    private Balance balance;
    private BufferedReader reader;
    private ShowHorsesMenuItem horseData;
    private boolean firstBet = true;

    public MakeBetMenuItem(List<Horse> horses, Balance balance, BufferedReader reader, ShowHorsesMenuItem horseData) {
        super("make bet");
        this.horses = horses;
        this.balance = balance;
        this.reader = reader;
        this.horseData = horseData;
    }

    @Override
    void doAction() {
        horseData.doAction();
        int betHorse;
        int betAmount;
        try {
            System.out.println("Please choose a horse");
            betHorse = Integer.parseInt(reader.readLine());
            System.out.println("Please enter your bet");
            betAmount = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } catch (NumberFormatException e) {
            System.err.println("Wrong input. Positive integer expected.");
            return;
        }
        if (betHorse < 1 || betHorse > horses.size()) {
            System.err.println("Wrong input. Please enter a number less then" + horses.size());
            return;
        }
        try {
            balance.withdraw(betAmount);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            return;
        }
        if (firstBet) {
            balance.deposit(betAmount * 2);
            System.out.println("Congratulations! You won!");
            firstBet = false;
            return;
        }
        int winnerHorse = startRace();
        if (winnerHorse == betHorse) {
            balance.deposit(betAmount * 2);
            System.out.println("Congratulations! You won!");
        } else {
            System.out.println("You lost. The winner is " + horses.get(winnerHorse - 1).getName());
        }
    }

    private int startRace() {
        int winner = 0;
        double maxSpeed = 0;
        for (int i = 0; i < horses.size(); i++) {
            double currentSpeed = horses.get(i).getBasicSpeed() + Math.random()*horses.get(i).getSpeedIncrease();
            if (currentSpeed > maxSpeed) {
                maxSpeed = currentSpeed;
                winner = i + 1;
            }
        }
        return winner;
    }
}
