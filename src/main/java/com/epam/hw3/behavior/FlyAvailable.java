package com.epam.hw3.behavior;

public class FlyAvailable implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Taking off and flying away.");
    }
}