package com.epam.hw1;

public class Dog extends Animal {

    @Override
    public void speak() {
        System.out.println(name + " says Woof");
    }

    @Override
    public void feed() {
        System.out.println(name + " eats meat");
    }

    @Override
    public void pet() {
        System.out.println(name + " likes it and wags its tail");
    }
}