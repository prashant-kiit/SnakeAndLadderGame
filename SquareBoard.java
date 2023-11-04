package SnakeAndLadderGame;

import java.util.ArrayList;

public class SquareBoard implements IBoard {
    private int[][] board;
    ArrayList<Snake> snakes;

    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int boxes_per_side) {
        board = new int[boxes_per_side][boxes_per_side];
        snakes = new SnakeManger().setgetSnakes();
    }
}
