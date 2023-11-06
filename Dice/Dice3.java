package SnakeAndLadderGame.Dice;

import java.util.Random;

public class Dice3 implements IDice{
    
    public Dice3() {
        System.out.println("Dice Type 3 is made!");
    }

    @Override
    public int roll() {
        Random rand = new Random();
        return rand.nextInt(4) + 1;
    }
}
