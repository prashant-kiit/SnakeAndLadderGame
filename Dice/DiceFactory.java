package SnakeAndLadderGame.Dice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiceFactory {
    public IDice manufactureDice() throws NumberFormatException, IOException {
        System.out.println("Enter the Dice type! 1. Type1 2. Type2 3. Type3");
        int diceType=Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine()); // input
        if (diceType == 1)
            return new Dice1();
        else if (diceType == 2)
            return new Dice2();
        else if (diceType == 3)
            return new Dice3();
        return new Dice1();
    }
}
