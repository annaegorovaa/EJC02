package com.epam.streams.task4;

import java.io.Serializable;

public class Actor implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;

    public Actor(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                '}';
    }
}
