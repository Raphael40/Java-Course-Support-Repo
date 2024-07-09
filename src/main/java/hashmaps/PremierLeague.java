package main.java.hashmaps;

import java.util.HashMap;
import java.util.Map.Entry;

public class PremierLeague {
    public static void main(String[] args) {

        // create a HashMap with a rank and a team as Integer and String
        HashMap<Integer, String> championsLeague = new HashMap<>();
        championsLeague.put(1, "Man City");
        championsLeague.put(2, "Arsenal");
        championsLeague.put(3, "Liverpool");

        // iterate through keys with keySet()
        for (Integer rank : championsLeague.keySet()) {
            System.out.println(rank + ": " + championsLeague.get(rank));
        }

        // we make a new Entry object which combines the key and value into one entry
        // then iterate over the entrySet()
        for (Entry<Integer, String> teamEntry : championsLeague.entrySet()) {
            // we can then use entry.getKey() and entry.getValue() instead of HashMap.get(key)
            System.out.println("key: " + teamEntry.getKey() + " value: " + teamEntry.getValue());
        }
    }
}
