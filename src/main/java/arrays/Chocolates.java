package main.java.arrays;

public class Chocolates {
    public static void main(String[] args) {
        String[] chocolates = {"Dairy Milk", "Crunchie", "Yorkie", "Freddo"};

        for (int counter = 0; counter <= chocolates.length - 1; counter++) {
            System.out.println(chocolates[counter]);
        }

        for (String chocolate : chocolates) {
            System.out.println(chocolate);
        }
    }

}
