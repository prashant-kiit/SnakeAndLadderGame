package SnakeAndLadderGame.Dice;

import java.util.Random;

public class Dice {

    public int roll1() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    public int roll2() {
        Random rand = new Random();
        return rand.nextInt(8) + 1;
    }

    public int roll3() {
        Random rand = new Random();
        return rand.nextInt(4) + 1;
    }
}
