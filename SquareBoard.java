package SnakeAndLadderGame;

public class SquareBoard implements IBoard{
    private int[][] board;
    // private Snake snake;
    // private Ladder ladder;

    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int boxes_per_side) {
        board=new int[boxes_per_side][boxes_per_side];
    }
}
