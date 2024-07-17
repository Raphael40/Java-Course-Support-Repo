package main.java.Interfaces;

public class Warrior implements GameCharacter{
    private String characterType;

    public Warrior() {
        this.characterType = "Warrior";
    }

    @Override
    public void attack() {
        System.out.println("Warrior attacks!");
    }

    @Override
    public void defend() {
        System.out.println("Warrior defends!");
    }

    @Override
    public String getCharacterType() {
        return this.characterType;
    }

    public String warriorSpecialMove() {
        return "Warrior Whirlwind attack!";
    }
}
