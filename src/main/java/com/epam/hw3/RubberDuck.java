package com.epam.hw3;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyUnavailable();
        quackBehavior = new NoQuack();
    }

    @Override
    public void present() {
        System.out.println("This is a toy rubber duck.");
    }
}
