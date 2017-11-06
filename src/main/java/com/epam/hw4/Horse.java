package com.epam.hw4;

public class Horse {
    private String name;
    private double basicSpeed;
    private double speedIncrease;

    public Horse(String name, double basicSpeed, double speedIncrease) {
        this.name = name;
        this.basicSpeed = basicSpeed;
        this.speedIncrease = speedIncrease;
    }

    public String getName() {
        return name;
    }

    public double getBasicSpeed() {
        return basicSpeed;
    }

    public double getSpeedIncrease() {
        return speedIncrease;
    }
}
