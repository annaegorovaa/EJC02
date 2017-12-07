package com.epam.oop.task3.stationery;

public class Pencil extends WritingAccessory {
    public Pencil(String producer) {
        super(producer);
    }

    @Override
    public String toString() {
        return "Pencil{" +
                "producer='" + producer + '\'' +
                '}';
    }
}
