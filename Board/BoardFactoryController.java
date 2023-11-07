package SnakeAndLadderGame.Board;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BoardFactoryController {
    private int boardType;
    public IMainBoard chooseBoard() throws NumberFormatException, IOException {
        System.out.println("Select the type of Board! 1. Type1 2. Type2");
        setBoardType(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine()));
        System.out.println("Creating new Board of Type " + boardType + "!");
        switch (boardType) {
            case 1:
                return new BoardFactory().manufactureBoard1();
            case 2:
                return new BoardFactory().manufactureBoard2();              
            default:
                return new BoardFactory().manufactureBoard3();
        }
    }

    public int getBoardType() {
        return boardType;
    }

    public void setBoardType(int boardType) {
        this.boardType = boardType;
    }
}
