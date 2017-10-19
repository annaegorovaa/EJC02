package com.epam.hw3;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyAvailable();
        quackBehavior = new Quack();
    }

    @Override
    public void present() {
        System.out.println("This is mallard duck.");
    }
}
