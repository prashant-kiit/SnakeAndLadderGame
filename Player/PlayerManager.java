package SnakeAndLadderGame.Player;

import java.util.ArrayList;

import SnakeAndLadderGame.Dice.DiceFactory;
import SnakeAndLadderGame.Dice.IDice;

public class PlayerManager {

    private ArrayList<Player> players = new ArrayList<Player>();
    private IDice iDice;

    public PlayerManager() {
        System.out.println("Welcome to  Player Manager Module!");
    }

    public void setPlayers() {
        System.out.println("Player creation begins!");
        int s = 1;
        do {
            this.players.add(new PlayerFactory().manufacturePlayer());
            System.out.println("Add Another Player: Yes or No!");
            s = 1; // or s = 0;
        } while (s == 1);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

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

    public void play() {
        for (Player player : players) {
            player.rollDice(getiDice());
        }
    }
}
