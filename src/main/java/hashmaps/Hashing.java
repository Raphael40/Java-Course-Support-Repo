package main.java.hashmaps;

import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {

        // Create a HashMap
        HashMap<String, Integer> movieRatings = new HashMap<>();

        // Add keys and values (title, rating)
        movieRatings.put("Avengers Endgame", 8);
        movieRatings.put("Iron Man", 9);
        movieRatings.put("Captain Marvel", 4);

        System.out.println(movieRatings.get("Iron Man"));
        // >> 9

        movieRatings.remove("Iron Man");

        System.out.println(movieRatings.get("Iron Man"));
        // >> null

        movieRatings.replace("Captian Marvel", 2); // replace 4 with 2

        System.out.println(movieRatings.get("Captain Marvel"));
        // >> 2
    }
}
