package com.epam.hw3.duck;

import org.junit.Assert;
import org.junit.Test;

public class DecoyDuckTest {
    private DecoyDuck decoyDuck = new DecoyDuck();

    @Test
    public void testSwim() {
        Assert.assertEquals("swim", decoyDuck.swim());
    }

    @Test
    public void testPresent() {
        Assert.assertEquals("decoy", decoyDuck.present());
    }

    @Test
    public void testFlyBehavior() {
        Assert.assertEquals("noFly", decoyDuck.performFly());
    }

    @Test
    public void testQuackBehavior() {
        Assert.assertEquals("quack", decoyDuck.performQuack());
    }
}
