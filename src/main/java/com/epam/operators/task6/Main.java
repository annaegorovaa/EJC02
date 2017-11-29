package com.epam.operators.task6;

public class Main {
    public static void main(String[] args) {
        Notepad notepad = new Notepad();
        notepad.showRecords();

        notepad.addNewRecord("aaa");
        notepad.showRecords();

        notepad.addNewRecord("bbb");
        notepad.showRecords();

        notepad.addNewRecord("ccc");
        notepad.showRecords();

        notepad.removeRecord(1);
        notepad.showRecords();

        notepad.addNewRecord("ddd");
        notepad.removeRecord("ccc");
        notepad.showRecords();

        notepad.editRecord(0, "aba");
        notepad.showRecords();

        notepad.editRecord("aza", "aaa");
        notepad.showRecords();
    }
}
