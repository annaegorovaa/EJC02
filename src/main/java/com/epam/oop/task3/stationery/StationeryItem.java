package com.epam.oop.task3.stationery;

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
}
