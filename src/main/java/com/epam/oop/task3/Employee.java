package com.epam.oop.task3;

import com.epam.oop.task3.stationery.*;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private List<StationeryItem> employeeStationarySet;

    public Employee(String name) {
        this.name = name;
    }

    public void generateStationarySet() {
        employeeStationarySet = new ArrayList<>();

        employeeStationarySet.add(new Pen("Bic", "blue"));
        employeeStationarySet.add(new Pen("Bic", "black"));
        employeeStationarySet.add(new Pencil("Hudozhnik"));
        employeeStationarySet.add(new Notepad("Svetoch", true));
        employeeStationarySet.add(new PrinterPaper("Svetoch", "white"));
    }

    public void viewEmployeeStationarySet() {
        System.out.println(name + "'s stationary list:");
        for (StationeryItem item: employeeStationarySet) {
            System.out.println(item);
        }
    }
}
