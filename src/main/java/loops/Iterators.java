package main.java.loops;

public class Iterators {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 10; counter++) {
            System.out.print(counter);
        }

        for (int counter = 10; counter >= 1; counter--) {
            System.out.println("launching in " + counter);
        }
        System.out.println("Blast off!");

        int i = 0;

        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        for (int counter = 1; counter <= 10; counter++) {
            if (counter % 2 == 1) {
                System.out.print(counter);
            }
        }
    }
}
