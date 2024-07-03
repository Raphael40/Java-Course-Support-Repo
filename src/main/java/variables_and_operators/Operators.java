package main.java.variables_and_operators;

public class Operators {
    public static void main(String[] args) {
        int five = 5;

        // Plus equals
        System.out.println(five += 3);

        // Minus equals
        System.out.println(five -= 2);

        // Times equals
        System.out.println(five *= 2);

        // Divide equals
        System.out.println(five /= 3);

        int ten = 10;
        int three = 3;

        // Addition
        System.out.println(ten + three);

        // Subtraction
        System.out.println(ten - three);

        // Multiplication
        System.out.println(ten * three);

        // Division
        System.out.println(ten / three);

        // Modulus (remainder after one number is divided by the other)
        System.out.println(ten % three);

        // Increment by 1
        System.out.println(++ten);

        // Decrement by 1
        System.out.println(--ten);

        int twenty = 20;

        // Equal to
        System.out.println(five == twenty);

        // Not equal to
        System.out.println(five != twenty);

        // Greater than
        System.out.println(five > twenty);

        // Less than
        System.out.println(five < twenty);

        // Greater than or equals to
        int alsoFive = 5;
        System.out.println(five >= alsoFive);

        // less than or equals to
        System.out.println(five <= alsoFive);

        int six = 6;

        // Logical && (and) returns true if both statements are true
        System.out.println((five < 20 && six < 20));

        System.out.println((five < 20 && six == five));

        // Logical || (or) returns true if at least one statement is true
        System.out.println((five < 20 || six == five));

        // Logical ! (not) reverses a boolean
        System.out.println(!true);

        System.out.println(!(five == six));
    }
}
