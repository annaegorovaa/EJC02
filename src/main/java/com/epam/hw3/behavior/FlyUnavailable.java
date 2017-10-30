package com.epam.hw3.behavior;

public class FlyUnavailable implements FlyBehavior {

    @Override
    public String fly() {
        System.out.println("Can't fly and stays put.");
        return "noFly";
    }
}
