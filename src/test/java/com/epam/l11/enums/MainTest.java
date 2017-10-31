package com.epam.l11.enums;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    Main main = new Main();
    @Test
    public void checkCatIsAllowed() {
        Assert.assertEquals("Barsik", main.checkCat("Barsik"));
        Assert.assertEquals("Murzik", main.checkCat("Murzik"));
        Assert.assertEquals("Murka", main.checkCat("Murka"));
    }

    @Test (expected = IllegalArgumentException.class)
    public void checkCatInNotAllowed() {
        main.checkCat("Nika");
    }
}
