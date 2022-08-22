package org.MovieLibrary;

import java.util.Random;
import java.util.Scanner;

public class Menu {
    public static void userMenu(MovieLibrary movies) {

        Scanner input = new Scanner(System.in);
        boolean quit = false;

        do {
            System.out.println("""
                    1. Podaj dwie daty aby wyświetlić nazwy filmów wydanych pomiędzy tymi datami
                    2. Wyświetl wszystkie informacje o losowym filmie
                    3. Podaj imię i nazwisko aktora aby wyświetlić nazwy filmów w jakich zagrał
                    4. Zamknięcie programu""");

            switch (input.nextLine()) {
                case "1" -> {
                    System.out.println("Podaj datę rozpoczynającą a następnie zamykającą przedział");
                    movies.displayMoviesCreatedBetweenDates(input.nextLine(), input.nextLine());
                }
                case "2" -> System.out.println(movies.getMovies().get(new Random().nextInt(movies.getMovies().size())).toString() + "\n");
                case "3" -> movies.displayMoviesWithSpecifiedActor(input.nextLine(), input.nextLine());
                case "4" -> {
                    System.out.println("Closing");
                    quit = true;
                }
                default -> System.out.println("Wrong option");
            }
        } while (!quit);
    }
}
