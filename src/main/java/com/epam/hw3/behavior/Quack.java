package com.epam.hw3.behavior;

public class Quack implements QuackBehavior {

    @Override
    public String quack() {
        System.out.println("Quack-quack!");
        return "quack";
    }
}
