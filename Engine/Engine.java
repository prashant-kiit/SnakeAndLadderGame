package SnakeAndLadderGame.Engine;

import java.util.ArrayList;

import SnakeAndLadderGame.Board.IMainBoard;
import SnakeAndLadderGame.Dice.IDice;
import SnakeAndLadderGame.Player.Player;

public class Engine {
    public void move(Player player, int diceRoll, IMainBoard iMainBoard) {
        int tempPosition=player.getCurrentPosition() + diceRoll;
        player.setCurrentPosition(iMainBoard.getBoxs(tempPosition).getInc() + iMainBoard.getBoxs(tempPosition).getDec());
    } 

    public void setup(ArrayList<Player> players) {
        for(Player player : players) {
            player.setCurrentPosition(0);
        }
    }    

    public void play(ArrayList<Player> players, IDice iDice, IMainBoard iMainBoard) {
        setup(players);
        for (Player player : players) {
            int diceRoll=player.rollDice(iDice);
            move(player, diceRoll, iMainBoard);
        }
    }
}
