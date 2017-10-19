package com.epam.hw3;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyUnavailable();
        quackBehavior = new Quack();
    }

    @Override
    public void present() {
        System.out.println("This is a decoy for ducks.");
    }
}
