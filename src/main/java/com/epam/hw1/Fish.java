package com.epam.hw1;

public class Fish extends Animal {

    @Override
    public void speak() {
        System.out.println(super.getName() + " doesn't speak");
    }

    @Override
    public void feed() {
        System.out.println(super.getName() + " eats worms");
    }

    @Override
    public void pet() {
        System.out.println(super.getName() + " is afraid of you!");
    }
}
