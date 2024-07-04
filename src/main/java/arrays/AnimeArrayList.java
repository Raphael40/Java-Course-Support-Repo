package main.java.arrays;

import java.util.ArrayList;

public class AnimeArrayList {
    public static void main(String[] args) {
        ArrayList<String> anime = new ArrayList<>();

        // Add new items:
        anime.add("Naruto");
        anime.add("One Piece");
        anime.add("Full Metal Alchemist Brotherhood");

        System.out.println("Anime: " + anime);
//        >> ArrayList: [Naruto, One Piece, Full Metal Alchemist Brotherhood]

        // Get a single item by index
        int indexOfNaruto = anime.indexOf("Naruto");
        System.out.println("Naruto: " + anime.get(indexOfNaruto));
//        >> Naruto: Naruto

        // Set method for replacing an item by index
        int indexOfOnePiece = anime.indexOf("One Piece");
        anime.set(indexOfOnePiece, "Hunter X Hunter");
        System.out.println("Anime: " + anime);
//        >> anime: [Naruto, Hunter X Hunter, Full Metal Alchemist Brotherhood]

        // Remove elements by index
        int indexOfFMAB = anime.indexOf("Full Metal Alchemist Brotherhood");
        String fMAB = anime.remove(indexOfFMAB); // Exception in thread "main" java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3
        System.out.println("Updated Anime: " + anime);
//        >> Updated anime: [Naruto, Hunter X Hunter]
        System.out.println("Removed Element: " + fMAB);
//        >> Removed Element: Full Metal Alchemist Brotherhood

        // Clear the array of all elements.
        anime.clear();
        System.out.println("Anime count: " + anime.size());
//        >> : ArrayList count: 0
        // Note that .size() returns the number of elements and .length returns the capacity

    }
}
