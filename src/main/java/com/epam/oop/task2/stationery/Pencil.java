package com.epam.oop.task2.stationery;

public class Pencil extends StationeryItem {

    public Pencil(String producer) {
        super(producer);
    }

    @Override
    public String toString() {
        return "Pencil{" +
                "producer='" + producer + '\'' +
                ", price=" + price +
                '}';
    }
}
