package com.epam.operators.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {
        int size = readArgs();
        createMatrix(size);
    }

    private static int[][] createMatrix(int size) {
        int[][] array = new int[size][size];

        for (int i = 0; i < size; i++) {
            array[i][i] = 1;
            array[i][size - 1 -i] = 1;
            array[size - 1 - i][i] = 1;
            array[size - 1 - i][size - 1 - i] = 1;
            System.out.println(Arrays.toString(array[i]));
        }

        return array;
    }

    private static int readArgs() {
        System.out.print("Please enter a number: ");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            return Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new IllegalArgumentException("Number expected");
    }
}


