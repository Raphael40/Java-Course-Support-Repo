package main.java;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static MovieLibrary movieLibrary;
    final private static Scanner movieScanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            printOptions();
            int choice = movieScanner.nextInt();
            movieScanner.nextLine();
            // Make this a switch statement (for performance)
            if (choice == 1) {
                // addMovieInputs()
                addMovie();
            } else if (choice == 2) {
                rateMovie();
            } else if (choice == 3) {
                listSingleMovie();
            } else if (choice == 4) {
                listAllMovies();
            } else if (choice == 5) {
                removeMovie();
            } else if (choice == 6) {
                System.out.println("Exiting...");
                running = false;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    private static void printOptions() {
        System.out.println("1. Add movie");
        System.out.println("2. Rate movie");
        System.out.println("3. List single movie");
        System.out.println("4. List movies");
        System.out.println("5. Remove movie");
        System.out.println("6. Exit");
    }

    public static void addMovie() {
        try {
            // Extract into seperate method
            System.out.println("Enter the title of the movie:");
            String title = movieScanner.nextLine();
            System.out.println("Enter the director of the movie:");
            String director = movieScanner.nextLine();
            System.out.println("Enter the rating of the movie:");
            double rating = movieScanner.nextDouble();
            System.out.println("Enter the year of the movie:");
            int year = movieScanner.nextInt();

            Movie movie = new Movie(title, director, rating, year);
            List<Movie> movies = new ArrayList<>();
            movieLibrary = new MovieLibrary(movies);
            movieLibrary.addMovie(movie);
            System.out.println("Movie added.");
        } catch (Exception e) {
            throw new InputMismatchException("Invalid input. Please enter the correct data types.");

//            System.out.println("Invalid input. Please enter the correct data types.");
        }
    }

    private static void rateMovie() {
        try {
            System.out.println("Enter the title of the movie:");
            String title = movieScanner.nextLine();

            Movie movie = movieLibrary.getMovieByTitle(title);
            if (movie == null) {
                System.out.println("Movie not found.");
                return;
            }

            System.out.println("Enter the new rating of the movie:");
            double rating = movieScanner.nextDouble();
            movieScanner.nextLine();

            movieLibrary.rateMovie(movie, rating);
            System.out.println("Movie rating updated.");
        } catch (Exception e) {
            movieScanner.nextLine();
            System.out.println("Invalid input. Please enter the correct data types.");
        }
    }

    private static void listSingleMovie() {
        try {
            System.out.println("Enter the title of the movie:");
            String title = movieScanner.nextLine();

            Movie movie = movieLibrary.getMovieByTitle(title);
            if (movie != null) {
                System.out.println(movie.getTitle() + " (" + movie.getYear() + ") - " + movie.getDirector() + " - " + movie.getRating());
            } else {
                System.out.println("Movie not found.");
            }
        } catch (Exception e) {
            movieScanner.nextLine();
            System.out.println("Invalid input. Please enter the correct data types.");
        }
    }

    private static void listAllMovies() {
        try {
            if (movieLibrary.getMovies().isEmpty()) {
                System.out.println("No movies found.");
                return;
            }

            int count = 1;
            for (Movie movie : movieLibrary.getMovies()) {
                System.out.println(count + ": " + movie.getTitle() + " (" + movie.getYear() + ") - " + movie.getDirector() + " - " + movie.getRating());
                count++;
            }
        } catch (Exception e) {
            movieScanner.nextLine();
            System.out.println("Invalid input. Please enter the correct data types.");
        }
    }

    public static void removeMovie() {
        try {
            System.out.println("Enter the title of the movie:");
            String title = movieScanner.nextLine();

            Movie movie = movieLibrary.getMovieByTitle(title);
            if (movie != null) {
                movieLibrary.removeMovie(movie);
                System.out.println("Movie removed.");
            } else {
                System.out.println("Movie not found.");
            }
        } catch (Exception e) {
            movieScanner.nextLine();
            System.out.println("Invalid input. Please enter the correct data types.");
        }
    }
}