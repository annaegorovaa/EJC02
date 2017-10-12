package com.epam.hw1;

public class Dog extends Animal {

    @Override
    public void speak() {
        System.out.println(super.getName() + " says Woof");
    }

    @Override
    public void feed() {
        System.out.println(super.getName() + " eats meat");
    }

    @Override
    public void pet() {
        System.out.println(super.getName() + " likes it and wags its tail");
    }
}
