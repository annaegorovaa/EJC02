package com.epam.hw3.duck;

import com.epam.hw3.behavior.FlyBehavior;
import com.epam.hw3.behavior.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void present();

    public void swim() {
        System.out.println("Swims in a pool.");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
