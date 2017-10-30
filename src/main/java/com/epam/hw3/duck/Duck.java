package com.epam.hw3.duck;

import com.epam.hw3.behavior.FlyBehavior;
import com.epam.hw3.behavior.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract String present();

    public String swim() {
        System.out.println("Swims in a pool.");
        return "swim";
    }

    public String performFly() {
        return flyBehavior.fly();
    }

    public String performQuack() {
        return quackBehavior.quack();
    }
}
