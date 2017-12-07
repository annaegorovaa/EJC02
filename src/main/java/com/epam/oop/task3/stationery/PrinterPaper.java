package com.epam.oop.task3.stationery;

public class PrinterPaper extends WritingAccessory {
    private String color;

    public PrinterPaper(String producer, String color) {
        super(producer);
        this.color = color;
    }

    @Override
    public String toString() {
        return "PrinterPaper{" +
                "color='" + color + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
