package SnakeAndLadderGame;

public class Board {
    private int boxes_per_side;
    private Snake snake;
    private Ladder ladder;

    public int getSide() {
        return boxes_per_side;
    }

    public void setSide(int boxes_per_side) {
        this.boxes_per_side=boxes_per_side;
    }

}
