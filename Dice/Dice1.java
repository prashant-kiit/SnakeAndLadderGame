package SnakeAndLadderGame.Dice;

import java.util.Random;

public class Dice1 implements IDice{

    public Dice1() {
        System.out.println("Dice Type 1 is made!");
    }

    @Override
    public int roll() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }
}
