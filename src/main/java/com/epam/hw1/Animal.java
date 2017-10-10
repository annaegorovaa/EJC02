package com.epam.hw1;

public abstract class Animal {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void speak();
    public abstract void feed();
    public abstract void pet();
}
