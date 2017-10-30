package com.epam.hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrafficLight {
    public int readTime() {
        String parameter;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Please enter minute you want to check:");
            parameter = reader.readLine();
            int inputTime = Integer.parseInt(parameter);
            if (inputTime < 0) {
                throw new IllegalArgumentException("Wrong input, positive integer expected instead of: " + parameter);
            }
            return inputTime;
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        throw new IllegalArgumentException();
    }
    /**
     * Checks the traffic light color in given minute.
     *
     * @return color name
     * */
    public String checkColor(int minute) {
        String color = "";
        if (minute < 0) {
            throw new IllegalArgumentException();
        }
        minute %= 60;
        minute %= 10;
        switch (minute) {
            case 0:
            case 1:
                color = "red";
                break;
            case 2:
            case 3:
            case 4:
                color = "yellow";
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                color = "green";
                break;
        }
        return color;
    }
}
