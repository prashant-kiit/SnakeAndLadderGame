package SnakeAndLadderGame.Engine;

import java.util.ArrayList;

import SnakeAndLadderGame.Board.IMainBoard;
import SnakeAndLadderGame.Dice.IDice;
import SnakeAndLadderGame.Player.Player;

public class Engine {
    private int gameOver=0;

    public int move(Player player, int diceRoll, IMainBoard iMainBoard) {
        int tempPosition=player.getCurrentPosition() + diceRoll;
        player.setCurrentPosition(iMainBoard.getBoxs(tempPosition).getInc() + iMainBoard.getBoxs(tempPosition).getDec());
        if (player.getCurrentPosition()>=iMainBoard.getTotalBoxes()) {
            System.out.println("Game over! " + player.getId() + " won!");
            return 1;
        }
        return 0;
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
            setGameOver(move(player, diceRoll, iMainBoard));
            if (getGameOver()==1) {
                break;
            }
        }
    }

    public int getGameOver() {
        return gameOver;
    }

    public void setGameOver(int gameOver) {
        this.gameOver = gameOver;
    }
} 

