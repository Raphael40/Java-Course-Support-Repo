package main.java.variables_and_operators;

public class Cat {
    public static void main(String[] items) {
        String cat = "Caspian"; // Assign a String to a variable

//      This will print the number of characters in a String
        System.out.println(cat.length());
//      >> 7

//      This one converts every character to a capital letter
        System.out.println(cat.toUpperCase());
//      >> "CASPIAN";

//      This returns true if a String starts with a specific letter.
        System.out.println(cat.startsWith("C")); // We can pass values into the parenthesis of many methods
//      >> true;

        String meow = "Meow";

        // Add the strings together
        String greeting = cat + " says " + meow + "!";
        System.out.println(greeting);
        // >> Caspian says Meow!

        // You can accomplish the same thing with the concat() method
        String greeting2 = cat.concat(" says ").concat(meow).concat("!");
        System.out.println(greeting2);
        // >> Caspian says Meow!

        // We can even concatenate a String and an int
        String fiftyStr = "50";
        int fiftyInt = 50;
        String fiftyFifty = fiftyStr + fiftyInt; // ints get coerced into Strings when concatenated
        System.out.println(fiftyFifty);
        // >> "5050"

        // String sentence = "And then the cat went "Meow"";
        // >> error

        // Double quote escape with a backslash
        String sentence = "And then the cat went \"Meow\"";
        System.out.println(sentence);
        // >> And then the cat went "Meow"

        // to write an actual backslash in Java use two of them
        String backslash = "This is a backslash - \\";
        System.out.println(backslash);
        // >> "This is a backslash - \"
    }

}
