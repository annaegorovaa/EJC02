package com.epam.hw2;

public class TrafficLight {
    public int minute;

    /**
     * Checks the traffic light color in given minute.
     *
     * @return color name
     * */
    public String checkColor() {
        String color = "";

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
