package SnakeAndLadderGame.src.Player;

import java.io.IOException;

import SnakeAndLadderGame.src.Dice.IDice;

public class Player {
    private int id;
    private String name;
    private IDice iDice;
    private int currentPosition = 0;

    public Player(int id) {
        this.id=id;
    }

    public Player(int id, String name) {
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id=id;
    }

    public void setName(String name) {
        this.name=name;
    }
    
    public IDice getiDice() {
        return iDice;
    }
    
    public void setiDice(IDice iDice) {
        this.iDice = iDice;
    }
    
    public int getCurrentPosition() {
        return currentPosition;
    }
    
    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }
    
    public int rollDice() throws NumberFormatException, IOException {     
        return iDice.roll();
    }
}
