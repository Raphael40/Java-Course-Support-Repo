package main.java;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MovieLibraryTest {

    private MovieLibrary testMovieLibrary; // MovieLibrary instance

    @BeforeEach
    void setUp() {
        ArrayList<Movie> moviesArrayList = new ArrayList<>(); // initialise ArrayList
        testMovieLibrary = new MovieLibrary(moviesArrayList); // Assign MovieLibrary instance with ArrayList
    }

    @Test
    @DisplayName("addToMovieLibrary test")
    void addMovie() {
        Movie testMovie = new Movie("test title", "test director", 6.0, 2022);

        testMovieLibrary.addMovie(testMovie);

        assertEquals(1, testMovieLibrary.getMovies().size());
    }

    @Test
    @DisplayName("rateMovie test")
    void rateMovie() {
        Movie testMovie = new Movie("test title", "test director", 6.0, 2022);

        testMovieLibrary.addMovie(testMovie);

        testMovieLibrary.rateMovie(testMovie, 4.0);

        assertEquals(4.0, testMovie.getRating());
    }

    @Test
    @DisplayName("removeMovie test")
    void removeMovie() {
        Movie testMovie = new Movie("test title", "test director", 6.0, 2022);

        testMovieLibrary.addMovie(testMovie);

        testMovieLibrary.removeMovie(testMovie);

        assertEquals(0, testMovieLibrary.getMovies().size());
    }

    @Test
    @DisplayName("getMovies test")
    void getMovies() {
        Movie testMovie = new Movie("test title", "test director", 6.0, 2022);
        testMovieLibrary.addMovie(testMovie);

        Movie testMovie2 = new Movie("test title 2", "test director 2", 6.0, 2022);
        testMovieLibrary.addMovie(testMovie2);

        assertEquals(2, testMovieLibrary.getMovies().size());
    }

    @Test
    @DisplayName("getMovieByTitle test")
    void getMovieByTitle() {
        Movie testMovie = new Movie("test title", "test director", 6.0, 2022);
        testMovieLibrary.addMovie(testMovie);

        assertEquals(testMovie, testMovieLibrary.getMovieByTitle("test title"));
        assertNull(testMovieLibrary.getMovieByTitle("incorrect title"));
    }
}