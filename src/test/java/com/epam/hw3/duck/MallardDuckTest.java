package com.epam.hw3.duck;

import org.junit.Assert;
import org.junit.Test;

public class MallardDuckTest {
    private MallardDuck mallardDuck = new MallardDuck();

    @Test
    public void testSwim() {
        Assert.assertEquals("swim", mallardDuck.swim());
    }

    @Test
    public void testPresent() {
        Assert.assertEquals("mallard", mallardDuck.present());
    }

    @Test
    public void testFlyBehavior() {
        Assert.assertEquals("fly", mallardDuck.performFly());
    }

    @Test
    public void testQuackBehavior() {
        Assert.assertEquals("quack", mallardDuck.performQuack());
    }
}
