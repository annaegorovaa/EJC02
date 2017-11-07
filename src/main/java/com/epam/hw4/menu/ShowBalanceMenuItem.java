package com.epam.hw4.menu;

import com.epam.hw4.Balance;

public class ShowBalanceMenuItem extends MenuItem {
    private Balance balance;

    public ShowBalanceMenuItem(Balance balance) {
        super("show balance");
        this.balance = balance;
    }

    @Override
    void doAction() {
        System.out.println("Your balance is " + balance.getBalance());
    }
}
