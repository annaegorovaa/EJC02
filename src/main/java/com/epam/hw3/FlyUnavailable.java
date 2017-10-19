package com.epam.hw3;

public class FlyUnavailable implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Can't fly and stays put.");
    }
}
