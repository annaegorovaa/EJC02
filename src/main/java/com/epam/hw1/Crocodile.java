package com.epam.hw1;

public class Crocodile extends Animal {

    @Override
    public void speak() {
        System.out.println(name + " doesn't speak");
    }

    @Override
    public void feed() {
        System.out.println(name + " wants to eat you!");
    }

    @Override
    public void pet() {
        System.out.println("You don't want to pet " + name + ".");
    }
}
