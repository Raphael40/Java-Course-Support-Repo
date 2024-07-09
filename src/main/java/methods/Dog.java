package main.java.methods;

public class Dog {
    String name;
    String breed;

    // constructor
    public Dog(String name, String breed) {
        // assigning the name instance field
        this.name = name;
        // assigning the breed instance field
        this.breed = breed;
    }

    public static void main(String[] args) {
        Dog.bark("Bark Bark");
//        Dog.woof();

        Dog boris = new Dog("Boris", "Pug");
        boris.woof();
        boris.breed();

        Dog Thibault = new Dog("Thibault", "Spaniel"); // pronounced 'Tee-Boh'
        Thibault.breed();
    }


    public static void bark(String bark) {
        System.out.println(bark);
    }

//    public static void woof() {
//        System.out.println("Woof Woof");
//    }

    public void woof() {
        System.out.println("Woof Woof");
    }

    public void breed() {
        System.out.println(this.name + " is a " + this.breed);
    }
}
