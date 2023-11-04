package SnakeAndLadderGame.Board;

import java.util.ArrayList;

import SnakeAndLadderGame.Snake.Snake;
import SnakeAndLadderGame.Snake.SnakeManager;

public class SquareBoard implements IBoard {
    private int[][] board;
    ArrayList<Snake> snakes;

    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int boxes_per_side) {
        board = new int[boxes_per_side][boxes_per_side];
        snakes = new SnakeManager().setgetSnakes();
    }
}
