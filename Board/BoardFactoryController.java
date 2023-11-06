package SnakeAndLadderGame.Board;

import java.io.IOException;

public class BoardFactoryController {
    public IMainBoard chooseBoard(int boardType) throws NumberFormatException, IOException {
        if (boardType == 1){
            return new BoardFactory().manufactureBoard1();
        }
        if (boardType == 2) {
            return new BoardFactory().manufactureBoard2();
        }
        else {
            return new BoardFactory().manufactureBoard3();
        }
    }
}
