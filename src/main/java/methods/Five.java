package main.java.methods;

public class Five {
    public static void main(String[] args) {
        int number = Five.timesFive(5);
        int secondNumber = Five.timesFive(6);

        System.out.println("number: " + number + " secondNumber: " + secondNumber);

        // We can then use these variables however we see fit, e.g. passing them to other methods
        System.out.println(Five.multiply(number, secondNumber));
    }

    // use int instead of void
    public static int timesFive(int num) {
//        System.out.println(num * 5);

        // return the value
        return num * 5;
    }

    public static int multiply(int number, int secondNumber) {
        return number * secondNumber;
    }
}
