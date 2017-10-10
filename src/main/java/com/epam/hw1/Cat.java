package com.epam.hw1;

public class Cat extends Animal {

    @Override
    public void speak() {
        System.out.println(name + " says Meow");
    }

    @Override
    public void feed() {
        System.out.println(name + " eats mice");
    }

    @Override
    public void pet() {
        System.out.println(name + " likes it and purrs");
    }
}
