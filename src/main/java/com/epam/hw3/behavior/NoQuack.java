package com.epam.hw3.behavior;

public class NoQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Silence.");
    }
}
