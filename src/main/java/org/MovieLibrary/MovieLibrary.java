package org.MovieLibrary;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

public class MovieLibrary {
    private ArrayList<Movie> movies;

    public MovieLibrary() {
    }

    @Override
    public String toString() {
        return movies.stream().map(Objects::toString).collect(Collectors.joining("\n\n"));
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void displayMoviesCreatedBetweenDates(String startDate, String endDate) {
        movies
                .stream()
                .filter(movie -> Integer.parseInt(movie.getDate()) > Integer.parseInt(startDate))
                .filter(movie -> Integer.parseInt(movie.getDate()) < Integer.parseInt(endDate))
                .forEach(movie -> System.out.println((movie) + "\n"));
    }

    public void displayMoviesWithSpecifiedActor(String firstName, String lastName) {
        // MovieLibrary list =
        movies
                .stream()
                .filter(movie -> movie.getActors()
                        .stream()
                        .filter(actor -> actor.getFirstName().equals(firstName) && actor.getLastName().equals(lastName))
                        .findFirst()
                        .isPresent())
                .forEach(movie -> System.out.println((movie) + "\n"));

    }

}
