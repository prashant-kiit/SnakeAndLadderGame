package SnakeAndLadderGame.Board;

import java.util.ArrayList;

import SnakeAndLadderGame.Ladder.Ladder;
import SnakeAndLadderGame.Ladder.LadderManager;
import SnakeAndLadderGame.Snake.Snake;
import SnakeAndLadderGame.Snake.SnakeManager;

public class SquareBoard implements IBoard {
    private int[][] board;
    private ArrayList<Snake> snakes;
    private ArrayList<Ladder> ladders;

    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int boxes_per_side) {
        board = new int[boxes_per_side][boxes_per_side];
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
