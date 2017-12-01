package com.epam.oop.task2;

import com.epam.oop.task2.stationery.StationeryItem;

import java.util.HashMap;
import java.util.Map;

public class StationeryRecord {
    private String employeeName;
    Map<StationeryItem, Integer> stationarySet;

    public StationeryRecord(String employeeName) {
        this.employeeName = employeeName;
        stationarySet = new HashMap<>();
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void addStationaryToEmployee(StationeryItem item, Integer quantity) {
        if (stationarySet.containsKey(item)) {
            stationarySet.replace(item, stationarySet.get(item), stationarySet.get(item) + quantity);
        } else {
            stationarySet.put(item, quantity);
        }
    }

    public double countEmployeesStationaryPrice() {
        double totalCost = 0;

        for (Map.Entry<StationeryItem, Integer> entry : stationarySet.entrySet()) {
            totalCost += entry.getKey().getPrice() * entry.getValue();
        }

        return totalCost;
    }
}
