package SnakeAndLadderGame.src.Engine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import SnakeAndLadderGame.src.Board.IMainBoard;
import SnakeAndLadderGame.src.Player.Player;

public class Engine {
    private int gameOver = 0;

    public int move(Player player, int diceRoll, IMainBoard iMainBoard) throws NumberFormatException, IOException {
        System.out.println("Currently Playing : Player Id = " + player.getId() + "; Before Postion = "
                + player.getCurrentPosition() + "; Dice Rolled = " + diceRoll + " !");
        System.out.println("Give Signal !!!");
        Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int nominalPosition = player.getCurrentPosition() + diceRoll;
        int realPosition = iMainBoard.getBoxs(nominalPosition).getShiftTo();
        String Ladder_Snake = "None";
        if (nominalPosition < realPosition)
            Ladder_Snake = "Ladder";
        if (nominalPosition > realPosition)
            Ladder_Snake = "Snake";
        System.out.println("NominalPosition = " + nominalPosition + " RealPosition = " + realPosition
                + " Ladder_Snake = " + Ladder_Snake + " !");
        player.setCurrentPosition(realPosition);
        System.out.println("Currently Played : Player Id = " + player.getId() + "; After Postion = "
                + player.getCurrentPosition() + " !");
        if (player.getCurrentPosition() >= iMainBoard.getTotalBoxes()) {
            System.out.println("Game over! " + player.getId() + " won!");
            return 1;
        }
        return 0;
    }

    public void setup(ArrayList<Player> players) {
        for (Player player : players) {
            player.setCurrentPosition(1);
        }
    }

    public void play(ArrayList<Player> players, IMainBoard iMainBoard)
            throws NumberFormatException, IOException {
        System.out.println("Players taking postion at Box 1!");
        setup(players);
        System.out.println("Players Ready!");
        int i = 0;
        while (i < players.size()) {
            int diceRoll = players.get(i).rollDice();
            setGameOver(move(players.get(i), diceRoll, iMainBoard));
            if (getGameOver() == 1) {
                break;
            }
            i++;
            i = i % players.size();
        }
    }

    public int getGameOver() {
        return gameOver;
    }

    public void setGameOver(int gameOver) {
        this.gameOver = gameOver;
    }
}
