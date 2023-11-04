package SnakeAndLadderGame.Board;

public class BoardManager {
    private IBoard iboard;
    
    public BoardManager() {
        System.out.println("Welcome to Board Manager Module!");
    }

    public void setBoard() {
        System.out.println("Creating new Board!");
        iboard=new BoardFactory().manufactureBoard();
        System.out.println("New Board is created!");
    }

    public IBoard getBoard() {
        return iboard;
    }
}
