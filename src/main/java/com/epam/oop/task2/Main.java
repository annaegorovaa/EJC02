package com.epam.oop.task2;

import com.epam.oop.task2.stationery.Notepad;
import com.epam.oop.task2.stationery.Pen;
import com.epam.oop.task2.stationery.Pencil;

public class Main {
    public static void main(String[] args) {
        Notepad basicNotepad = new Notepad("Koh-i-Noor", false);
        basicNotepad.setPrice(40);
        Notepad improvedNotepad = new Notepad("Herlitz", true);
        improvedNotepad.setPrice(63);
        Pen basicBluePen = new Pen("Koh-i-Noor", "blue");
        basicBluePen.setPrice(9.5);
        Pen basicBlackPen = new Pen("Koh-i-Noor", "black");
        basicBlackPen.setPrice(9.5);
        Pen improvedBluePen = new Pen("Herlitz", "blue");
        improvedBluePen.setPrice(35.2);
        Pen improvedBlackPen = new Pen("Herlitz", "black");
        improvedBlackPen.setPrice(35.2);
        Pencil basicPencil = new Pencil("Koh-i-Noor");
        basicPencil.setPrice(7.5);
        Pencil improvedPencil = new Pencil("Herlitz");
        improvedPencil.setPrice(15);

        StationeryRecord ivanov = new StationeryRecord("Ivan Ivanov");
        ivanov.addStationaryToEmployee(basicBluePen, 2);
        ivanov.addStationaryToEmployee(basicBlackPen, 1);
        ivanov.addStationaryToEmployee(basicNotepad, 1);
        ivanov.addStationaryToEmployee(basicPencil, 3);

        StationeryRecord pupkin = new StationeryRecord("Vasily Pupkin");
        pupkin.addStationaryToEmployee(improvedBluePen, 1);
        pupkin.addStationaryToEmployee(improvedBlackPen, 1);
        pupkin.addStationaryToEmployee(improvedNotepad, 1);
        pupkin.addStationaryToEmployee(improvedPencil, 2);

        System.out.println("Total cost of " + ivanov.getEmployeeName() + "'s stationery: " +
                ivanov.countEmployeesStationaryPrice() + " roubles");
        System.out.println("Total cost of " + pupkin.getEmployeeName() + "'s stationery: " +
                pupkin.countEmployeesStationaryPrice() + " roubles");
    }
}
