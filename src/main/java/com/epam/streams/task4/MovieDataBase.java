package com.epam.streams.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MovieDataBase {
    public static void main(String[] args) {
        MovieDataBase movieDB = new MovieDataBase();
        List<Movie> movies = movieDB.getMovieDB();
        if (movies.size() == 0) {
            movieDB.addNewMovies(movies);
        }
        System.out.println(movies);
        movieDB.saveMovieDB(movies);
    }

    private void saveMovieDB(List<Movie> movies) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("movies.ser"))){
            oos.writeObject(movies);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addNewMovies(List<Movie> movies) {
        Actor johnDoe = new Actor("John Doe");
        Actor janeDoe = new Actor("Jane Doe");
        Actor paulSmith = new Actor("Paul Smith");
        Actor maryBlack = new Actor("Mary Black");

        Movie goodMovie = new Movie("Good Movie");
        goodMovie.addActor(janeDoe);
        goodMovie.addActor(paulSmith);
        goodMovie.addActor(maryBlack);

        Movie badMovie = new Movie("Bad Movie");
        badMovie.addActor(johnDoe);
        badMovie.addActor(janeDoe);
        badMovie.addActor(maryBlack);

        movies.add(goodMovie);
        movies.add(badMovie);
    }

    private List<Movie> getMovieDB() {
        File movieFile = new File("movies.ser");
        List<Movie> movies = null;
        if (!movieFile.exists()) {
            movies = new ArrayList<>();
        } else {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("movies.ser"))) {
                movies = (ArrayList<Movie>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return movies;
    }
}
