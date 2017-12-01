package com.epam.oop.task2.stationery;

public abstract class StationeryItem {
    String producer;
    double price;

    public StationeryItem(String producer) {
        this.producer = producer;
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

        StationeryItem that = (StationeryItem) o;

        if (Double.compare(that.price, price) != 0) return false;
        return producer.equals(that.producer);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = producer.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "StationeryItem{" +
                "producer='" + producer + '\'' +
                ", price=" + price +
                '}';
    }
}
