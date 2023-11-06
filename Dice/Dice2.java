package SnakeAndLadderGame.Dice;

import java.util.Random;

public class Dice2 implements IDice{

    public Dice2() {
        System.out.println("Dice Type 2 is made!");
    }

    @Override
    public int roll() {
        Random rand = new Random();
        return rand.nextInt(8) + 1;
    }
}
