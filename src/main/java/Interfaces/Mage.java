package main.java.Interfaces;

public class Mage implements GameCharacter{
    private String characterType;

    public Mage() {
        this.characterType = "Mage";
    }

    public void attack() {
        System.out.println("Mage attacks!");
    }

    public void defend() {
        System.out.println("Mage defends!");
    }

    public String getCharacterType() {
        return this.characterType;
    }
}
