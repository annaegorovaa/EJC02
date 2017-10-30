package com.epam.hw3.duck;

import org.junit.Assert;
import org.junit.Test;

public class RubberDuckTest {
    private RubberDuck rubberDuck = new RubberDuck();

    @Test
    public void testSwim() {
        Assert.assertEquals("swim", rubberDuck.swim());
    }

    @Test
    public void testPresent() {
        Assert.assertEquals("rubber", rubberDuck.present());
    }

    @Test
    public void testFlyBehavior() {
        Assert.assertEquals("noFly", rubberDuck.performFly());
    }

    @Test
    public void testQuackBehavior() {
        Assert.assertEquals("noQuack", rubberDuck.performQuack());
    }
}
