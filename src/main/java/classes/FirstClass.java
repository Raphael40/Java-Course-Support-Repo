package main.java.classes;

public class FirstClass {

    public static void main(String[] items) {
        System.out.println("This is my first class");

        int ten = 10;
        int three = 3;

        System.out.println(ten * three);

        System.out.println(++ten);

        System.out.println(three > ten);

        System.out.println((three < 20 && ten < 20));

        System.out.println(!true);

        String cat = "caspian";
        System.out.println(cat.startsWith("c"));

        String h = "Hello";
        String t = "there";

        String greeting = h + " " + t + ", General Grevious";
        System.out.println(greeting);

        String greeting2 = h.concat(" ").concat(t).concat(", General Grevious");
        System.out.println(greeting2);

        String sentence = "And then the main character said \"This cereal is really tasty\"";
        System.out.println(sentence);
    }

}

