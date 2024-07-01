package main.java;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class MovieLibraryTest {

    private MovieLibrary testMovieLibrary;
    private Movie testMovie;

    @BeforeEach
    void setUp() {
        testMovieLibrary = new MovieLibrary();
        testMovie = new Movie("test title", "test director", 5.0, 2021);
    }

    @Test
    @DisplayName("addMovie test")
    void addMovie() {
        testMovieLibrary.addMovie(testMovie);

        assertEquals(1, testMovieLibrary.getMovies().size());
    }

    @Test
    @DisplayName("rateMovie test")
    void rateMovie() {
        testMovieLibrary.addMovie(testMovie);

        testMovieLibrary.rateMovie(testMovie, 4.0);

        assertEquals(4.0, testMovie.getRating());
    }

    @Test
    @DisplayName("removeMovie test")
    void removeMovie() {
        testMovieLibrary.addMovie(testMovie);

        testMovieLibrary.removeMovie(testMovie);

        assertEquals(0, testMovieLibrary.getMovies().size());
    }

    @Test
    @DisplayName("getMovies test")
    void getMovies() {
        Movie testMovie2 = new Movie("test title 2", "test director 2", 6.0, 2022);

        testMovieLibrary.addMovie(testMovie);
        testMovieLibrary.addMovie(testMovie2);

        assertEquals(2, testMovieLibrary.getMovies().size());
    }

    @Test
    @DisplayName("getMovieByTitle test")
    void getMovieByTitle() {
        testMovieLibrary.addMovie(testMovie);

        assertEquals(testMovie, testMovieLibrary.getMovieByTitle("test title"));
        assertNull(testMovieLibrary.getMovieByTitle("incorrect title"));
    }
}