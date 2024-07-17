package main.java.Interfaces;

public class Game {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Mage mage = new Mage();

        System.out.println(warrior.getCharacterType());
        warrior.attack();
        warrior.defend();
        System.out.println(warrior.warriorSpecialMove());

        GameCharacter.printCharacterInfo(mage);
    }
}
