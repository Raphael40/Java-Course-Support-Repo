package main.java;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

import uk.org.webcompere.systemstubs.jupiter.SystemStubsExtension;
import uk.org.webcompere.systemstubs.jupiter.SystemStub;
import uk.org.webcompere.systemstubs.stream.SystemIn;
import uk.org.webcompere.systemstubs.stream.SystemOut;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SystemStubsExtension.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MainTest {

    @SystemStub
    private SystemIn systemIn;

    @SystemStub
    private SystemOut systemOut;

    @BeforeEach
    void setUp() {
        systemIn.setInputStream(new ByteArrayInputStream(new byte[0]));
        systemOut.clear();
    }

    @Test
    @Order(1)
    @DisplayName("addToMovieLibrary test")
    void addToMovieLibrary() {
        List<Movie> movies = new ArrayList<>();
        Main.movieLibrary = new MovieLibrary(movies);

        Movie movie = new Movie("test title", "test director", 5.0, 2021);
        Main.addToMovieLibrary(movie);

        String output = systemOut.getText();
        assertEquals("Movie added.\n", output);
        assertTrue(output.contains("Movie added."));
    }


}