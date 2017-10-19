package com.epam.hw3;

public class NoQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silence.");
    }
}
