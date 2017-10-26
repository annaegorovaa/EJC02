package com.epam.l8.generic;

public class Cat {
    private String name;

    public Cat(String n) {
        this.name = n;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
