package SnakeAndLadderGame.Board;

import java.io.IOException;

public class BoardManager {
    private IMainBoard iMainBoard;

    public BoardManager() {
        System.out.println("Welcome to Board Manager Module!");
    }

    public void setiMainBoard() throws IOException {
        iMainBoard = new BoardFactoryController().chooseBoard();
    }

    public IMainBoard getiMainBoard() {
        return iMainBoard;
    }

    public void setiMainBoard(IMainBoard iMainBoard) {
        this.iMainBoard = iMainBoard;
    }

}
