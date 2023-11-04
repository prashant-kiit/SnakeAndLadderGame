package SnakeAndLadderGame.Board;

import java.util.ArrayList;

import SnakeAndLadderGame.Snake.Snake;
import SnakeAndLadderGame.Snake.SnakeManager;

public class RectangleBoard implements IBoard{
    private int[][] board;
    ArrayList<Snake> snakes;
    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int boxes_x_axis, int boxes_y_axis) {
        board=new int[boxes_x_axis][boxes_y_axis];
        snakes = new SnakeManager().setgetSnakes();
    }
}
