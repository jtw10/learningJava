import java.util.Random;

/**
 * simulation of a 6-sided dice roll
 */
public class Dice {
    public static void main(String[] args) {

        Random diceRoll = new Random();
        int output = diceRoll.nextInt(6) + 1;

        System.out.println("You rolled a: " + output);
    }
}
