package com.epam.hw3;

import java.util.ArrayList;
import java.util.List;

public class DuckFarm {
    public static void main(String[] args) {
        List duckFarm = createFarm();
        displayFarm(duckFarm);
    }

    private static void displayFarm(List<Duck> ducks) {
        for(Duck d: ducks) {
            d.present();
            System.out.print("Let's make it quack - ");
            d.performQuack();
            System.out.print("Let's make it fly - ");
            d.performFly();
            System.out.println();
        }
    }

    private static ArrayList createFarm() {
        ArrayList<Duck> farm = new ArrayList();
        farm.add(new MallardDuck());
        farm.add(new DecoyDuck());
        farm.add(new RubberDuck());

        return farm;
    }
}
