package SnakeAndLadderGame;

import java.util.ArrayList;

public class PlayerManager {

    private ArrayList<Player> players=new ArrayList<Player>();

    public PlayerManager() {
         System.out.println("Welcome to  Player Manager Module!"); 
    }

    public void setPlayers() {   
        int s=1;
        do {
            System.out.println("Enter id and name of the Player!");
            int id=1;
            String name="Ram";
            players.add(new Player(id, name));
            System.out.println("Add Player: Yes or No!");
            s=0;
        } while(s==1);
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void displayPlayers() {
        for(Player player : players) {
            System.out.println(player.getId() + " " + player.getName());
        }
    }
}
