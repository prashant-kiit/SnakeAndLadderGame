package SnakeAndLadderGame;

public class RectangleBoard implements IBoard{
    private int[][] board;
    // private Snake snake;
    // private Ladder ladder;

    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int boxes_x_axis, int boxes_y_axis) {
        board=new int[boxes_x_axis][boxes_y_axis];
    }
}
