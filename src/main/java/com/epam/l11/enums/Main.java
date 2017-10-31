package com.epam.l11.enums;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Please enter cat's name:");
        main.checkCat(main.readInput());
    }

    public String checkCat(String name) {
        for (Cat cat: Cat.values()) {
            if(Objects.equals(cat.toString(), name)) {
                System.out.println(name + " is allowed to enter the house");
                return name;
            }
        }
        throw new IllegalArgumentException(name + " is not allowed to enter the house!");
    }

    public String readInput() {
        String input = null;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            input = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return input;
    }
}
