package main.java;

import java.util.Scanner;

public class Main {
    final private static MovieLibrary movieLibrary = new MovieLibrary();
    final private static Scanner movieScanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            printOption();
            int choice = movieScanner.nextInt();
            movieScanner.nextLine();
            if (choice == 1) {
                addMovie();
            } else if (choice == 2) {
                rateMovie();
            } else if (choice == 3) {
                removeMovie();
            } else if (choice == 4) {
                listMovies();
            } else if (choice == 5) {
                listSingleMovie();
            } else if (choice == 6) {
                running = false;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }

    private static void printOption() {
        System.out.println("1. Add movie");
        System.out.println("2. Rate movie");
        System.out.println("3. Remove movie");
        System.out.println("4. List movies");
        System.out.println("5. List single movie");
        System.out.println("6. Exit");
    }

    private static void addMovie() {
        try {
            System.out.println("Enter the title of the movie:");
            String title = movieScanner.nextLine();
            System.out.println("Enter the director of the movie:");
            String director = movieScanner.nextLine();
            System.out.println("Enter the rating of the movie:");
            double rating = movieScanner.nextDouble();
            System.out.println("Enter the year of the movie:");
            int year = movieScanner.nextInt();

            Movie movie = new Movie(title, director, rating, year);
            movieLibrary.addMovie(movie);
            System.out.println("Movie added.");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter the correct data types.");
            movieScanner.nextLine();
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
            System.out.println("Invalid input. Please enter the correct data types.");
            movieScanner.nextLine();
        }
    }

    private static void removeMovie() {
        System.out.println("Enter the title of the movie:");
        String title = movieScanner.nextLine();
        Movie movie = movieLibrary.getMovieByTitle(title);
        if (movie != null) {
            movieLibrary.removeMovie(movie);
        } else {
            System.out.println("Movie not found.");
        }
    }

    private static void listMovies() {
        for (Movie movie : movieLibrary.getMovies()) {
            System.out.println(movie.getTitle() + " (" + movie.getYear() + ") - " + movie.getDirector() + " - " + movie.getRating());
        }
    }

    private static void listSingleMovie() {
        System.out.println("Enter the title of the movie:");
        String title = movieScanner.nextLine();

        Movie movie = movieLibrary.getMovieByTitle(title);
        if (movie != null) {
            System.out.println(movie.getTitle() + " (" + movie.getYear() + ") - " + movie.getDirector() + " - " + movie.getRating());
        } else {
            System.out.println("Movie not found.");
        }
    }
}
