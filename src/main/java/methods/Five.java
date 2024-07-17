package main.java.methods;

public class Five {
    public static void main(String[] args) {
        Five.timesFive(5);
        Five.timesFive(6);
    }

    public static void timesFive(int num) {
        System.out.println(num * 5);
    }

}
