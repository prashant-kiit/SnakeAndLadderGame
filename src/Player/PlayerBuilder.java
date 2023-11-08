package SnakeAndLadderGame.src.Player;

public class PlayerBuilder {
    private int id;
    private String name = new String("NA");

    public PlayerBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public PlayerBuilder setName(String name) {
        this.name = name;
        return this;
    }  
    
    public Player getPlayer() {
        return new Player(id, name);
    }
}
