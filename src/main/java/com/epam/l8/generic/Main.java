package com.epam.l8.generic;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Cat> catSet = new HashSet<>();
        catSet.add(new Cat("Barsik"));
        catSet.add(new Cat("Murzik"));
        catSet.add(new Cat("Nika"));

        System.out.println(catSet);
    }
}
