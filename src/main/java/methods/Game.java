package main.java.methods;

public class Game {
    String name;
    int score;

    // constructor
    public Game(String name) {
        this.name = name;
        this.score = 0;
//        Since the score always starts at 0 we can hard code it instead of passing it in as an argument.
    }

    public static void main(String[] args) {
        Game.welcome();

        Game sudoku = new Game("Sudoku");
        sudoku.addPoints(20);
        sudoku.displayScore();
    }

    public static void welcome() {
        System.out.println("Welcome to the Game!");
    }

    public void addPoints(int points) {
        this.score += points;
    }

    public void displayScore() {
        System.out.println("Your score for ".concat(this.name) + " is " + this.score);
    }
}
