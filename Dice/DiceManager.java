package SnakeAndLadderGame.Dice;

public class DiceManager {
    private IDice iDice;

    public IDice getiDice() {
        return iDice;
    }

    public void setiDice() {
        System.out.println("Setting up the Dice!");
        System.out.println("Enter the Dice type!");
        String diceType="Type1"; // input
        this.iDice = new DiceFactory().manufacturDice(diceType);
        System.out.println("Dice made!");
    }
}
