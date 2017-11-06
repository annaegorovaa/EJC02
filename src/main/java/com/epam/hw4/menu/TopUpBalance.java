package com.epam.hw4.menu;

import com.epam.hw4.Balance;

import java.io.BufferedReader;
import java.io.IOException;

public class TopUpBalance extends MenuItem {
    private Balance balance;
    private BufferedReader reader;

    public TopUpBalance(Balance balance, BufferedReader reader) {
        super("top up balance");
        this.balance = balance;
        this.reader = reader;
    }

    @Override
    void doAction() {
        System.out.println("Please enter your deposit:");
        try {
            balance.deposit(Integer.parseInt(reader.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } catch (IllegalArgumentException e) {
            System.err.println("Wrong input. Positive integer expected.");
            return;
        }
        System.out.println("Your balance is " + balance.getBalance());
    }
}
