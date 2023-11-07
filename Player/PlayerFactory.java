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
        System.out.println("Enter format code:\n 1 : id ,\n 2 : id-name,\n Other : id-name!");
        int format;
        format = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        switch (format) {
            case 1:
                System.out.println("Enter Id!");
                setId(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine()));
                return new PlayerBuilder().setId(getId()).getPlayer();
            case 2:
                System.out.println("Enter Id and Name!");
                setId(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine()));
                setName((new BufferedReader(new InputStreamReader(System.in)).readLine()));
                return new PlayerBuilder().setId(getId()).setName(getName()).getPlayer();
            default:
                System.out.println("Enter Id and Name!");
                setId(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine()));
                setName((new BufferedReader(new InputStreamReader(System.in)).readLine()));
                return new PlayerBuilder().setName(getName()).setId(getId()).getPlayer();
        }
    }
}
