package SnakeAndLadderGame;

public class BoardManager {
    private Board board;
    private int boxes_per_side;
    
    public BoardManager() {
        System.out.println("Welcome to Board Manager Module!");
    }

    public void setBoard() {
        board=new Board();
        System.out.println("New Board is created!");
        System.out.println("Enter the no of Boxes per Side!");
        boxes_per_side=8;
        board.setBoard(boxes_per_side);
    }

    public void getBoard() {

    }

}
