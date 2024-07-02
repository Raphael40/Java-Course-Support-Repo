package main.java;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.InputMismatchException;

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
    @DisplayName("addMovie test")
    void addMovie() throws Exception {
        String inputs = "test title\ntest director\n5.0\n2021\n";
        systemIn.setInputStream(new ByteArrayInputStream(inputs.getBytes()));

        Method method = Main.class.getDeclaredMethod("addMovie");
        method.setAccessible(true);
        method.invoke(null);

        String output = systemOut.getText();
        assertTrue(output.contains("Enter the title of the movie:"));
        assertTrue(output.contains("Enter the director of the movie:"));
        assertTrue(output.contains("Enter the rating of the movie:"));
        assertTrue(output.contains("Enter the year of the movie:"));
        assertTrue(output.contains("Movie added."));
    }

    @Test
    @Order(2)
    @DisplayName("addMovieError test")
    void addMovieError() throws Exception {
        String inputs = "test title\ntest director\nnot a double\n2021\n";
        systemIn.setInputStream(new ByteArrayInputStream(inputs.getBytes()));

        Method method = Main.class.getDeclaredMethod("addMovie");
        method.setAccessible(true);

        Throwable thrown = assertThrows(InvocationTargetException.class, () -> method.invoke(null));
        Throwable actualError = thrown.getCause();

        assertInstanceOf(InputMismatchException.class, actualError);
        assertEquals("Invalid input. Please enter the correct data types.", actualError.getMessage().trim());
    }
}