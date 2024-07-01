package main.java;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    private Movie testMovie;

    @BeforeEach
    void setUp() {
        testMovie = new Movie("test title", "test director", 5.0, 2021);
    }

    @Test
    @DisplayName("getTitle test")
    void getTitle() {
        assertEquals("test title", testMovie.getTitle());
    }

    @Test
    @DisplayName("getDirector test")
    void getDirector() {
        assertEquals("test director", testMovie.getDirector());
    }

    @Test
    @DisplayName("getRating test")
    void getRating() {
        assertEquals(5.0, testMovie.getRating());
    }

    @Test
    @DisplayName("getYear test")
    void getYear() {
        assertEquals(2021, testMovie.getYear());
    }

    @Test
    @DisplayName("setRating test")
    void setRating() {
        assertEquals(5.0, testMovie.getRating());
        testMovie.setRating(4.0);
        assertEquals(4.0, testMovie.getRating());
    }

    @Test
    @DisplayName("setRating test exception")
    void setRatingException() {
        assertThrows(IllegalArgumentException.class, () -> testMovie.setRating(-1.0));
    }
}