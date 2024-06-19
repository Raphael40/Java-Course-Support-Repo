package main.java;

public class Coffee {
    private String type;
    private double price; // Double is a primitive data type for decimals

    // Constructor
    public Coffee(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String displayDetails() {
        return "Coffee Type: " + type + " Price: £" + price;
    }
}
