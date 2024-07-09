package main.java.hashmaps;

import java.util.HashMap;

public class Lambda {
    public static void main(String[] args) {
        HashMap<String, Runnable> actions = new HashMap<>();

        actions.put("sayHello", () -> System.out.println("Hello, World!"));
        actions.put("sayGoodbye", () -> System.out.println("Goodbye, World!"));

        actions.get("sayHello").run();
        actions.get("sayGoodbye").run();

//      >> Hello, World!
//      >> Goodbye, World!
    }
}
