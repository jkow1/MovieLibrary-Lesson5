package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            MovieLibary movies = new MoviesJsonDeserializer().deserializeJson("src/main/resources/movies.json");
            movies.getMovies().stream().forEach(movie -> System.out.println("\n" + (movie.toString())));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}