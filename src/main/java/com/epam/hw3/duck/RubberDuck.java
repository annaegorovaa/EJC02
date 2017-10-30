package com.epam.hw3.duck;

import com.epam.hw3.behavior.FlyUnavailable;
import com.epam.hw3.behavior.NoQuack;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyUnavailable();
        quackBehavior = new NoQuack();
    }

    @Override
    public String present() {
        System.out.println("This is a toy rubber duck.");
        return "rubber";
    }
}
