package com.epam.hw4.menu;

import com.epam.hw4.Horse;

import java.util.List;

public class ShowHorsesMenuItem extends MenuItem {

    private List<Horse> horses;

    public ShowHorsesMenuItem(List<Horse> horses) {
        super("show information about horses");
        this.horses = horses;
    }

    @Override
    void doAction() {
        for (int i = 0; i < horses.size(); i++) {
            System.out.println(i + 1);
            System.out.println("Name: " + horses.get(i).getName());
            System.out.println("Basic speed: " + horses.get(i).getBasicSpeed());
            System.out.println("Possible speed increase: " + horses.get(i).getSpeedIncrease());
            System.out.println("\n");
        }
    }
}
