package SnakeAndLadderGame.Dice;

import java.io.IOException;

public class DiceManager {
    private IDice iDice;

    public IDice getiDice() {
        return iDice;
    }

    public void setiDice() throws NumberFormatException, IOException {
        System.out.println("Setting up the Dice!");
        this.iDice = new DiceFactory().manufactureDice();
    }
}
