package com.epam.oop.task1;

public class Pen {
    private String producer;
    private String color;
    private double price;

    public Pen(String producer, String color) {
        this.producer = producer;
        this.color = color;
    }

    public String getProducer() {
        return producer;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pen pen = (Pen) o;

        if (Double.compare(pen.price, price) != 0) return false;
        if (producer != null ? !producer.equals(pen.producer) : pen.producer != null) return false;
        return color != null ? color.equals(pen.color) : pen.color == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = producer != null ? producer.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
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
