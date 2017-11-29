package com.epam.operators.task4;

public class Array1D {
    public static void main(String[] args) {
        double[] arr1 = {2.5, 0.3, 1.4, 8.2};
        double[] arr2 = {3.7, 5.2, 0.1, 0.6, 8.4, 9.0, 1.7, 6.3};
        double[] arr3 = {0.3, 0.2, 0.5, 0.4};
        System.out.println(findMax(arr1));
        System.out.println(findMax(arr2));
        System.out.println(findMax(arr3));
    }

    private static double findMax(double[] array) {
        if (array.length % 2 == 0) {
            double max = -Double.MAX_VALUE;
            for (int i = 0; i < array.length/2; i++) {
                max = Math.max(max, (array[i] + array[array.length - 1 - i]));
            }
            return max;
        } else {
            throw new RuntimeException("Array length should be an even number");
        }
    }
}
