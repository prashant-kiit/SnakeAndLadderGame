package SnakeAndLadderGame.Board;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BoardManager {
    private IMainBoard iMainBoard;
    private int boardType;

    public BoardManager() {
        System.out.println("Welcome to Board Manager Module!");
    }

    public void setiMainBoard() throws IOException {
        System.out.println("Select the type of Board! 1. Type1 2. Type2");
        setBoardType(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine()));
        System.out.println("Creating new Board of Type " + boardType + "!");
        iMainBoard=new BoardFactoryController().chooseBoard(getBoardType());
    }

    public IMainBoard getiMainBoard() {
        return iMainBoard;
    }

    public void setiMainBoard(IMainBoard iMainBoard) {
        this.iMainBoard = iMainBoard;
    }

    public int getBoardType() {
        return boardType;
    }

    public void setBoardType(int boardType) {
        this.boardType = boardType;
    }
    
}
