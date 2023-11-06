package SnakeAndLadderGame.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PlayerDiceManager {

    private ArrayList<Player> players = new ArrayList<Player>();


    public PlayerDiceManager() {
        System.out.println("Welcome to  Player Manager Module!");
    }

    public void setPlayers() throws NumberFormatException, IOException {
        System.out.println("Player creation begins!");
        int s;
        do {
            this.players.add(new PlayerFactory().manufacturePlayer());
            System.out.println("Add Another Player: Yes or No!");
            s = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        } while (s == 1);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }


}
