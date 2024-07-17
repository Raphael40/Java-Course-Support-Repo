package main.java.Interfaces;

interface GameCharacter {
    void attack();
    void defend();
    String getCharacterType();

    static void printCharacterInfo(GameCharacter character) {
        System.out.println("Character Type: " + character.getCharacterType());
        character.attack();
        character.defend();
    }
}
