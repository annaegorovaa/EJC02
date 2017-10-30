package com.epam.hw2;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        try {
            System.out.println("The color of the traffic light is " + trafficLight.checkColor(trafficLight.readTime()));
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
