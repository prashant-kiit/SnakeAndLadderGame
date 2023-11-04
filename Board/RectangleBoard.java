package SnakeAndLadderGame.Board;

import java.util.ArrayList;

import SnakeAndLadderGame.Ladder.Ladder;
import SnakeAndLadderGame.Ladder.LadderManager;
import SnakeAndLadderGame.Snake.Snake;
import SnakeAndLadderGame.Snake.SnakeManager;

public class RectangleBoard implements IBoard{
    private int[][] board;
    private ArrayList<Snake> snakes;
    private ArrayList<Ladder> ladders;
    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int boxes_x_axis, int boxes_y_axis) {
        board=new int[boxes_x_axis][boxes_y_axis];
        setSnakes(new SnakeManager().setgetSnakes());
        setLadders(new LadderManager().setgetLadders());
    }

    public ArrayList<Snake> getSnakes() {
        return snakes;
    }

    public ArrayList<Ladder> getLadders() {
        return ladders;
    }

    public void setSnakes(ArrayList<Snake> snakes) {
        this.snakes = snakes;
    }

    public void setLadders(ArrayList<Ladder> ladders) {
        this.ladders = ladders;
    }
}
