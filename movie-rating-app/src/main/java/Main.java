package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static MovieLibrary movieLibrary;
    final private static Scanner movieScanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        List<Movie> movies = new ArrayList<>();
        movieLibrary = new MovieLibrary(movies);

        while (running) {
            printOptions();
            int choice = movieScanner.nextInt();
            movieScanner.nextLine();
            switch (choice) {
                case 1:
                    Movie movie = enterMovieDetails();
                    addToMovieLibrary(movie);
                    break;
                case 2:
                    rateMovie();
                    break;
                case 3:
                    listSingleMovie();
                    break;
                case 4:
                    listAllMovies();
                    break;
                case 5:
                    removeMovie();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
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

    public static Movie enterMovieDetails() {
        try {
            System.out.println("Enter the title of the movie:");
            String title = movieScanner.nextLine();
            System.out.println("Enter the director of the movie:");
            String director = movieScanner.nextLine();
            System.out.println("Enter the rating of the movie:");
            double rating = movieScanner.nextDouble();
            movieScanner.nextLine();
            System.out.println("Enter the year of the movie:");
            int year = movieScanner.nextInt();
            movieScanner.nextLine();

            return new Movie(title, director, rating, year);
        } catch (Exception e) {
            movieScanner.nextLine();
            System.out.println("Invalid input. Please enter the correct data types.");
            return null;
        }
    }

    public static void addToMovieLibrary(Movie movie) {
        try {
            movieLibrary.addMovie(movie);
            System.out.println("Movie added.");
        } catch (Exception e) {
            System.out.println("Movie could not be added to the MovieLibrary." + Exception.class.getName());
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
                System.out.print("\n");
                System.out.println(movie.getTitle() + " (" + movie.getYear() + ") - " + movie.getDirector() + " - " + movie.getRating());
                System.out.print("\n");
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

            System.out.print("\n");
            int count = 1;
            for (Movie movie : movieLibrary.getMovies()) {
                System.out.println(count + ": " + movie.getTitle() + " (" + movie.getYear() + ") - " + movie.getDirector() + " - " + movie.getRating());
                count++;
            }
            System.out.print("\n");
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
