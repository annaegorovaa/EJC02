package com.epam.hw1;

public class Fish extends Animal {

    @Override
    public void speak() {
        System.out.println("Your " + name + " doesn't speak");
    }

    @Override
    public void feed() {
        System.out.println("Your " + name + " eats worms");
    }

    @Override
    public void pet() {
        System.out.println(name + " is afraid of you!");
    }
}
