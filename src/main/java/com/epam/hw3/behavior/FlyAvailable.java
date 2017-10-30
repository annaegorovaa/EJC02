package com.epam.hw3.behavior;

public class FlyAvailable implements FlyBehavior {

    @Override
    public String fly() {
        System.out.println("Taking off and flying away.");
        return "fly";
    }
}
