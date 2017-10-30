package com.epam.hw3.duck;

import com.epam.hw3.behavior.FlyUnavailable;
import com.epam.hw3.behavior.Quack;

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
