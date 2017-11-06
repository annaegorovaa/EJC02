package com.epam.hw4;

import com.epam.hw4.menu.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.startGambling();
    }

    private void startGambling() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            Balance balance = new Balance();

            List<Horse> horses = new ArrayList<>();
            horses.add(new Horse("Star", 2, 5));
            horses.add(new Horse("Storm", 4, 3));
            horses.add(new Horse("Rainbow", 5, 2));
            horses.add(new Horse("Diamond", 1, 6));
            horses.add(new Horse("Sunny", 3, 4));

            List<MenuItem> menuItems = new ArrayList<>();
            ShowHorseData horseData = new ShowHorseData(horses);
            menuItems.add(horseData);
            menuItems.add(new ShowBalance(balance));
            menuItems.add(new TopUpBalance(balance, reader));
            menuItems.add(new MakeBet(horses, balance, reader, horseData));

            Menu menu = new Menu(menuItems, reader);
            printGreeting();

            while (!menu.isStopped()) {
                menu.printMenu();
                menu.chooseMenuItem();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printGreeting() {
        System.out.println("Welcome to \"LUCKY GAMBLING\"!");
        System.out.println("Make a fortune by placing a bet on your favorite horse!");
    }
}
