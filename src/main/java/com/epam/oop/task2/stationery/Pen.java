package com.epam.oop.task2.stationery;

public class Pen extends StationeryItem{
    String color;

    public Pen(String producer, String color) {
        super(producer);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Pen pen = (Pen) o;

        return color.equals(pen.color);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + color.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "producer='" + producer + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
