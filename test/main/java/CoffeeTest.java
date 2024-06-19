package main.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeTest {

    @Test
    @DisplayName("Coffee class instance test")
    void coffeeInstance() {
        Coffee americano = new Coffee("Americano", 3.99);

        // This checks that the actual class of 'americano' is Coffee
        assertEquals(Coffee.class, americano.getClass());
    }

    @Test
    @DisplayName("Coffee displayDetails method")
    void displayTest() {
        // Make an instance
        Coffee americano = new Coffee("Americano", 3.99);

        // Now call the displayDetails() method
        String americanoDetails = americano.displayDetails();
        // And assert that it is equal to our expected output
        assertEquals(americanoDetails, "Coffee Type: Americano Price: £3.99");
    }
}