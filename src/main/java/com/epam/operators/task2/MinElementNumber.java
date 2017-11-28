package com.epam.operators.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MinElementNumber {
    public static void main(String[] args) {
        double epsilon = readArgs();
        findMinElementInSequence(epsilon);
    }

    private static void findMinElementInSequence(double epsilon) {
        List<Double> sequence = new ArrayList<>();
        int i = 1;
        double sequenceElement;

        do {
            sequenceElement = 1 / Math.pow(i + 1, 2);
            sequence.add(sequenceElement);
            i++;
        } while (sequenceElement >= epsilon);

        System.out.println("The number of element: " + sequence.size());
        System.out.println(sequence.toString());
    }

    private static double readArgs() {
        System.out.print("Please enter a number: ");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            return Double.parseDouble(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new IllegalArgumentException("Number expected");
    }
}
