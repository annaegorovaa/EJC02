package com.epam.operators.task3;

public class Cycles {
    public static void main(String[] args) {
        showFunctionResult(0, 5, 0.3);
        showFunctionResult(-3, 2, 0.2);
    }

    private static void showFunctionResult(double a, double b, double h) {
        System.out.println("\na = " + a + ", b = " + b + ", h = " + h);
        for (double i = a; i < b; i += h) {
            System.out.printf("%f \t%f\n", i, (Math.tanh(2 * i) - 3));
        }
    }
}
