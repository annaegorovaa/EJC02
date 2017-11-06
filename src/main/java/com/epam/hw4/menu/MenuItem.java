package com.epam.hw4.menu;

public abstract class MenuItem {
    private String title;

    public MenuItem(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    abstract void doAction();
}
