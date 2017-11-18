package com.epam.streams.task4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Movie implements Serializable {
    private static final long serialVersionUID = 1L;

    private String title;

    private List<Actor> actors;

    public Movie(String title) {
        this.title = title;
        actors = new ArrayList<>();
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", actors=" + actors +
                '}';
    }
}
