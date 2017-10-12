package com.epam.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        ArrayList<Animal> homeZoo = makeZoo();

        showAnimals(homeZoo);
        giveNames(homeZoo);
        communicateWithAnimals(homeZoo);
    }

    private static void showAnimals(ArrayList<Animal> homeZoo) {
        System.out.println("In your zoo you have:");
        for(Animal a: homeZoo) {
            System.out.println(" a " + a.getClass().getSimpleName().toLowerCase());
        }
    }

    private static void giveNames(ArrayList<Animal> homeZoo) throws IOException {
        System.out.println("Let's give them names!");
        for(Animal a: homeZoo) {
            System.out.println("What would be the name for your " + a.getClass().getSimpleName().toLowerCase() + "?");
            String name = reader.readLine();
            a.setName(name);
        }
    }

    private static void communicateWithAnimals(ArrayList<Animal> homeZoo) throws IOException {
        System.out.println("What do you want to do with your animals?\n" +
                "1 - speak\n2 - feed\n3 - pet\n");

        String choice = reader.readLine();
        for(Animal a: homeZoo){
            switch (choice) {
                case "1":
                case "speak":
                    a.speak();
                    break;
                case "2":
                case "feed":
                    a.feed();
                    break;
                case "3":
                case "pet":
                    a.pet();
                    break;
                default:
                    System.out.println("You can't do this with your " + a.getClass().getSimpleName().toLowerCase());
            }
        }
    }

    public static ArrayList makeZoo() {
        ArrayList<Animal> zoo = new ArrayList();
        zoo.add(new Cat());
        zoo.add(new Dog());
        zoo.add(new Fish());
        zoo.add(new Crocodile());

        return zoo;
    }
}
