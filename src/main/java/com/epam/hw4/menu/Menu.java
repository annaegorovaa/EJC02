package com.epam.hw4.menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class Menu {
    private List<MenuItem> menuItems;
    private BufferedReader reader;
    private boolean stopped;

    public Menu(List<MenuItem> menuItems, BufferedReader reader) {
        this.menuItems = menuItems;
        this.reader = reader;
    }

    public void printMenu() {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((i + 1) + " - " + menuItems.get(i).getTitle());
        }
        System.out.println("0 - Exit");
    }

    public void chooseMenuItem() {
        System.out.println("Please enter your choice:");
        int choice;
        try {
            choice = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } catch (NumberFormatException e) {
            System.err.println("Wrong input. Positive integer expected.");
            return;
        }
        if (choice == 0) {
            stopped = true;
            return;
        } else if (choice < 1 || choice > menuItems.size()) {
            System.err.println("Wrong input. Please enter a number less then" + menuItems.size());
            return;
        }
        menuItems.get(choice - 1).doAction();
    }

    public boolean isStopped() {
        return stopped;
    }
}
