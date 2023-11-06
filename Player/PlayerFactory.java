package SnakeAndLadderGame.Player;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlayerFactory {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player manufacturePlayer() throws NumberFormatException, IOException {
        System.out.println("Enter format code: 1 : id , 2 : id-name, Other : id-name!");
        int s;
        s = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        switch (s) {
            case 1:
                System.out.println("Enter Id!");
                setId(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine()));
                return new Player(getId());
            case 2:
                System.out.println("Enter Id and Name!");
                id = 1;
                name = "Ram";
                return new Player(id, name);
            default:
                System.out.println("Enter Id and Name!");
                id = 1;
                name = "Ram";
                return new Player(id, name);
        }
    }
}
