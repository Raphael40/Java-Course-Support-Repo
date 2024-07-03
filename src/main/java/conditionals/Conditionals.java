package main.java.conditionals;

public class Conditionals {
    public static void main(String[] args) {
        // If 10 is greater than 5
        int ten = 10;

        if (ten > 5) {
            System.out.println("I printed because it is true that 10 is greater than 5");
        }

        // If 10 is less than 5int five = 5;
        int five = 5;
        String six = "six";
        //
        if (five < 20 && six == "six") {
            System.out.println("Logical operators can be used in if statements");
        }

        String cat = "Hendrix";

        if (cat == "Caspian") {
            System.out.println("That's my cat, Caspian!");
        } else {
            System.out.println("Oh nah that's not my cat");
        }

        if (cat == "Caspian") {
            System.out.println("That's my cat, Caspian!");
        } else if (cat == "Hendrix") {
            System.out.println("Ah it's Hendrix");
        } else {
            System.out.println("I do not know this cat");
        }
    }
}
