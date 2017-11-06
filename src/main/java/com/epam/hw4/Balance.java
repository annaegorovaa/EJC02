package com.epam.hw4;

public class Balance {
    private int balance;

    public Balance() {
        balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) throws IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException("Wrong input. Positive integer expected.");
        }
        balance += amount;
    }

    public void withdraw(int amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Wrong input. Positive integer expected.");
        }
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Your balance is less then " + amount);
        }
    }
}
