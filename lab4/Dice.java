package lab4;

import java.util.Random;

/**
 * Dice
 */
public class Dice {
    private Random random;
    private int numberOfSides;

    public Dice(int numberOfSides){
        this.numberOfSides = numberOfSides;
        this.random = new Random();

    }

    public int roll() {
        return (random.nextInt(numberOfSides))+1;
    }

    
}