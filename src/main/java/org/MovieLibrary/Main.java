package org.MovieLibrary;

public class Main {
    public static void main(String[] args) {

        MovieLibrary movies = MoviesJsonDeserializer.deserializeJson("src/main/resources/movies.json");
        Menu.userMenu(movies);

    }
}