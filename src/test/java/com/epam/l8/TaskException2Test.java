package com.epam.l8;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TaskException2Test {
    private TaskException2 exception2;

    @Before
    public void setup() {
        exception2 = new TaskException2();
    }

    @Test
    public void TestCheckInputIsCorrect() {
        Assert.assertEquals("January", exception2.checkInput("1"));
        Assert.assertEquals("February", exception2.checkInput("2"));
        Assert.assertEquals("March", exception2.checkInput("3"));
        Assert.assertEquals("April", exception2.checkInput("4"));
        Assert.assertEquals("May", exception2.checkInput("5"));
        Assert.assertEquals("June", exception2.checkInput("6"));
        Assert.assertEquals("July", exception2.checkInput("7"));
        Assert.assertEquals("August", exception2.checkInput("8"));
        Assert.assertEquals("September", exception2.checkInput("9"));
        Assert.assertEquals("October", exception2.checkInput("10"));
        Assert.assertEquals("November", exception2.checkInput("11"));
        Assert.assertEquals("December", exception2.checkInput("12"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestCheckInputIsWrong() {
        exception2.checkInput("");
    }
}
