package com.epam.oop.task3.stationery;

public class Pen extends WritingAccessory {
    private String color;

    public Pen(String producer, String color) {
        super(producer);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "color='" + color + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
