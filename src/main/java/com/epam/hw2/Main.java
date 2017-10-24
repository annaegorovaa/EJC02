package com.epam.hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.minute = readTime();
        System.out.println("The color of the traffic light is " + trafficLight.checkColor());
    }

    private static int readTime() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Please enter minute you want to check:");
            int inputTime = Integer.parseInt(reader.readLine());
            if (inputTime < 0) {
                System.out.println("Wrong input: positive integer expected");
                System.exit(1);
            }
            return inputTime;
        } catch (IOException e) {
            System.out.println(e);
            System.exit(1);
        } catch (NumberFormatException e) {
            System.out.println("Wrong input: integer expected");
            System.exit(1);
        }
        return -1;
    }
}
