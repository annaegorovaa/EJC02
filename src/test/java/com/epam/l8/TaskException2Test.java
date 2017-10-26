package com.epam.l8;

import com.epam.l7.TaskException;
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
    public void TestCheckInputIs1() {
        Assert.assertEquals("January", exception2.checkInput("1"));
    }

    @Test
    public void TestCheckInputIs2() {
        Assert.assertEquals("February", exception2.checkInput("2"));
    }

    @Test
    public void TestCheckInputIs3() {
        Assert.assertEquals("March", exception2.checkInput("3"));
    }

    @Test
    public void TestCheckInputIs4() {
        Assert.assertEquals("April", exception2.checkInput("4"));
    }

    @Test
    public void TestCheckInputIs5() {
        Assert.assertEquals("May", exception2.checkInput("5"));
    }

    @Test
    public void TestCheckInputIs6() {
        Assert.assertEquals("June", exception2.checkInput("6"));
    }

    @Test
    public void TestCheckInputIs7() {
        Assert.assertEquals("July", exception2.checkInput("7"));
    }

    @Test
    public void TestCheckInputIs8() {
        Assert.assertEquals("August", exception2.checkInput("8"));
    }

    @Test
    public void TestCheckInputIs9() {
        Assert.assertEquals("September", exception2.checkInput("9"));
    }

    @Test
    public void TestCheckInputIs10() {
        Assert.assertEquals("October", exception2.checkInput("10"));
    }

    @Test
    public void TestCheckInputIs11() {
        Assert.assertEquals("November", exception2.checkInput("11"));
    }

    @Test
    public void TestCheckInputIs12() {
        Assert.assertEquals("December", exception2.checkInput("12"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void TestCheckInputIsWrong() {
        exception2.checkInput("");
    }
}
