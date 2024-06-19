package main.java;

public class Patient {
    String name;
    int age;
    String condition;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.condition = "unknown";
    }

    public void updateCondition(String condition) {
        this.condition = condition;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getCondition() {
        return this.condition;
    }
}
