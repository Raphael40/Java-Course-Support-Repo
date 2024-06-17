package main.java;

public class MyCalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Test add method
        if (calculator.add(2, 3) != 5) {
            System.out.println("Test failed: add(2, 3) should be 5");
        } else {
            System.out.println("Test passed: add(2, 3)");
        }

        // Test subtract method
        if (calculator.subtract(5, 3) != 2) {
            System.out.println("Test failed: subtract(5, 3) should be 2");
        } else {
            System.out.println("Test passed: subtract(5, 3)");
        }
    }
}
