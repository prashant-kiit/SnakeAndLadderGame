package SnakeAndLadderGame.Dice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiceAdapter implements IDice{
    @Override
    public int roll() throws NumberFormatException, IOException {
        System.out.println("Enter the Dice type! 1. Type1 2. Type2 3. Type3");
        int diceType=Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine()); 
        switch (diceType) {
            case 1:
                return new Dice().roll1();
            case 2:
                return new Dice().roll2();
            case 3:
                return new Dice().roll3();
            default:
                return new Dice().roll1();
        }
    }
}
