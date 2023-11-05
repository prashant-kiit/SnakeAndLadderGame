package SnakeAndLadderGame.Player;

import SnakeAndLadderGame.Dice.IDice;

public class Player {
    private int id;
    private String name;
    private IDice iDice;

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

    public int rollDice(IDice iDice) {
        setiDice(iDice);
        return getiDice().roll();
    }
}
