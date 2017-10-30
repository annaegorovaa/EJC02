package com.epam.hw3.behavior;

public class NoQuack implements QuackBehavior {
    @Override
    public String quack() {
        System.out.println("Silence.");
        return "noQuack";
    }
}
