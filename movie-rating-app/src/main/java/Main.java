package main.java;

import java.util.Scanner;

public class Main {
    final private static MovieLibrary movieLibrary = new MovieLibrary();
    final private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            printOption();
            int choice = scanner.nextInt();
            scanner.nextLine();
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
        System.out.println("Enter the title of the movie:");
        String title = scanner.nextLine();
        System.out.println("Enter the director of the movie:");
        String director = scanner.nextLine();
        System.out.println("Enter the rating of the movie:");
        double rating = scanner.nextDouble();
        System.out.println("Enter the year of the movie:");
        int year = scanner.nextInt();

        Movie movie = new Movie(title, director, rating, year);
        movieLibrary.addMovie(movie);
        System.out.println("Movie added.");
    }

    private static void rateMovie() {
        System.out.println("Enter the title of the movie:");
        String title = scanner.nextLine();
        System.out.println("Enter the new rating of the movie:");
        double rating = scanner.nextDouble();
        scanner.nextLine();
        movieLibrary.rateMovie(title, rating);
    }

    private static void removeMovie() {
        System.out.println("Enter the title of the movie:");
        String title = scanner.nextLine();
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
        String title = scanner.nextLine();

        Movie movie = movieLibrary.getMovieByTitle(title);
        if (movie != null) {
            System.out.println(movie.getTitle() + " (" + movie.getYear() + ") - " + movie.getDirector() + " - " + movie.getRating());
        } else {
            System.out.println("Movie not found.");
        }
    }
}
