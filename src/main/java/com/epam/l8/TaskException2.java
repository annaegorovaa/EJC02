package com.epam.l8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskException2 {
    public static void main(String[] args) {
        TaskException2 exception2 = new TaskException2();
        try {
            exception2.readInput();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public void readInput() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Please type a number from 1 to 12");
            checkInput(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String checkInput(String input) {
        switch (input) {
            case "1":
                System.out.println("January");
                return "January";
            case "2":
                System.out.println("February");
                return "February";
            case "3":
                System.out.println("March");
                return "March";
            case "4":
                System.out.println("April");
                return "April";
            case "5":
                System.out.println("May");
                return "May";
            case "6":
                System.out.println("June");
                return "June";
            case "7":
                System.out.println("July");
                return "July";
            case "8":
                System.out.println("August");
                return "August";
            case "9":
                System.out.println("September");
                return "September";
            case "10":
                System.out.println("October");
                return "October";
            case "11":
                System.out.println("November");
                return "November";
            case "12":
                System.out.println("December");
                return "December";
            default:
                throw new IllegalArgumentException("Wrong input, positive integer from 1 to 12 expected instead of: "
                        + input);
        }
    }
}
