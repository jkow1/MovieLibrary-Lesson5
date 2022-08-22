package org.example;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

public class Movie {
    private String title;
    private Director director;
    private String genre;
    private String date;
    private ArrayList<Actor> actors;

    public Movie() {
    }

    @Override
    public String toString() {
        return "Title: " + title + "\n" +
                "Director: " + director + "\n" +
                "Genre: " + genre + "\n" +
                "Date: " + date + "\n" +
                "Actors: " + actors.stream().map(Objects::toString).collect(Collectors.joining(", "));
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }
}
