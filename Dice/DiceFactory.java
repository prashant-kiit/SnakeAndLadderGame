package SnakeAndLadderGame.Dice;

public class DiceFactory {
    public IDice manufacturDice(String diceType) {
        if (diceType == "Type1")
            return new Dice1();
        else if (diceType == "Type2")
            return new Dice2();
        return new Dice1();
    }
}
