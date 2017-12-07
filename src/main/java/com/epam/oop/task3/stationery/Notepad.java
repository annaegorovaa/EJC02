package com.epam.oop.task3.stationery;

public class Notepad extends PaperAccessory {
    boolean lined;

    public Notepad(String producer, boolean lined) {
        super(producer);
        this.lined = lined;
    }

    @Override
    public String toString() {
        return "Notepad{" +
                "lined=" + lined +
                ", producer='" + producer + '\'' +
                '}';
    }
}
