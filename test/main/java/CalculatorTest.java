package main.java;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Add method test - Calculator class")
    void add() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    @DisplayName("Subtract method test - Calculator class")
    void subtract() {
        assertAll(
            () -> assertEquals(2, Calculator.subtract(5, 3)),
            () -> assertEquals(10, Calculator.subtract(20, 10)),
            () -> assertEquals(-50, Calculator.subtract(100, 150)),
            () -> assertEquals(20, Calculator.subtract(-20, -40))
        );
    }

}