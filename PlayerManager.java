package SnakeAndLadderGame;

import java.util.ArrayList;

public class PlayerManager {

    private ArrayList<Player> players = new ArrayList<Player>();

    public PlayerManager() {
        System.out.println("Welcome to  Player Manager Module!");
    }

    public void setPlayers() {
        System.out.println("Player creation begins!");
        int s = 1;
        do {
            players.add(new PlayerFactory().manufacturePlayer());
            System.out.println("Add Another Player: Yes or No!");
            s = 1; // or s = 0;
        } while (s == 1);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void displayPlayers() {
        for (Player player : players) {
            System.out.println(player.getId() + " " + player.getName());
        }
    }
}
