package main.java.arrays;

public class Array {
    public static void main(String[] args) {
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        // Fixed at length 5 because it was initialized with 5 items

        // You can access the first value by its index of 0
        System.out.println(workdays[0]);

        System.out.println(workdays[3]);

        String[] myLanguages = new String[4];

        // Already has a .length of 4 before we have added the elements
        System.out.println(myLanguages.length); // Don't use parenthesis for <Array>.length


        myLanguages[0] = "Python";
        myLanguages[1] = "JavaScript";
        myLanguages[2] = "Swift";
        myLanguages[3] = "Ruby";

        System.out.println(myLanguages[2]);

        // In both versions we can replace a value like this
        myLanguages[2] = "Java";

        System.out.println(myLanguages[2]);
    }
}
