package SnakeAndLadderGame;

public class Player {
    private int id;
    private String name;

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

    public void displayPlayer() {
        System.out.println(id + " " + name);
    }
}
