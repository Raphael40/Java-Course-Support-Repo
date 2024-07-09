package main.java.hashmaps;

import java.util.HashMap;

public class HashMapExtra {
    public static void main(String[] args) {
    HashMap<String, Object> objectMap = new HashMap<>();

    objectMap.put("key1", "value1"); // String value
    objectMap.put("key2", 123); // Integer value

    String[] values = {"Integer", "String", "Boolean"};
    objectMap.put("key3", values); // You can also have an Array value

    // To retrieve this Array we can use get to save the Array to a variable
    String[] retrievedArray = (String[]) objectMap.get("key3");

    System.out.println(retrievedArray[0]);
    // >> Integer

    // declare a new HashMap names placesMap and make it a value for objectMap
    HashMap<String, String> placesMap = new HashMap<>();
    placesMap.put("city", "New York");
    placesMap.put("zipcode", "10001");

    objectMap.put("key4", placesMap);

    // We can retrieve the inner HashMap from the outer HashMap in a similar way:
    HashMap<String, String> retrievedMap = (HashMap<String, String>) objectMap.get("key4");

    System.out.println(retrievedMap.get("city"));
    // >> New York

    }

}
