package com.epam.hw2;

import org.junit.Assert;
import org.junit.Test;

public class TrafficLightTest {
    @Test
    public void testCheckColorIsRedMinute0() {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.minute = 0;
        Assert.assertEquals("red", trafficLight.checkColor());
    }

    @Test
    public void testCheckColorIsYellowMinute2() {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.minute = 2;
        Assert.assertEquals("yellow", trafficLight.checkColor());
    }

    @Test
    public void testCheckColorIsGreenMinute5() {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.minute = 5;
        Assert.assertEquals("green", trafficLight.checkColor());
    }

    @Test
    public void testCheckColorIsRedMinute60() {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.minute = 60;
        Assert.assertEquals("red", trafficLight.checkColor());
    }
}
