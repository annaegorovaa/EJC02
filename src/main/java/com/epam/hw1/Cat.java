package com.epam.hw1;

public class Cat extends Animal {

    @Override
    public void speak() {
        System.out.println(super.getName() + " says Meow");
    }

    @Override
    public void feed() {
        System.out.println(super.getName() + " eats mice");
    }

    @Override
    public void pet() {
        System.out.println(super.getName() + " likes it and purrs");
    }
}
