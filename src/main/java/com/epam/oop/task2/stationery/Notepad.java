package com.epam.oop.task2.stationery;

public class Notepad extends StationeryItem {
    boolean lined;

    public Notepad(String producer, boolean lined) {
        super(producer);
        this.lined = lined;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Notepad notepad = (Notepad) o;

        return lined == notepad.lined;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (lined ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Notepad{" +
                "producer='" + producer + '\'' +
                ", lined=" + lined +
                ", price=" + price +
                '}';
    }
}
