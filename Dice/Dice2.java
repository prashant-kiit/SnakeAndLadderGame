package SnakeAndLadderGame.Dice;

import java.util.Random;

public class Dice2 implements IDice{
    @Override
    public int roll() {
        Random rand = new Random();
        return rand.nextInt(8) + 1;
    }
}
