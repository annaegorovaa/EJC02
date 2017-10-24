package com.epam.l7;

import org.junit.Assert;
import org.junit.Test;

public class TaskExceptionTest {
    @Test
    public void testCheckInputIsCorrect() {
        TaskException taskException = new TaskException();
        Assert.assertEquals("Barsik", taskException.checkInput("Barsik"));
    }

    @Test (expected = BarsikException.class)
    public void testCheckInputIsIncorrect() {
        TaskException taskException = new TaskException();
        taskException.checkInput("");
    }
}
