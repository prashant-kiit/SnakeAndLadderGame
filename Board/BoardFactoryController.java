package SnakeAndLadderGame.Board;

public class BoardFactoryController {
    public IMainBoard chooseBoard(String boardType) {
        if (boardType == "Type1"){
            return new BoardFactory().manufactureBoard1();
        }
        if (boardType == "Type2") {
            return new BoardFactory().manufactureBoard2();
        }
        else {
            return new BoardFactory().manufactureBoard3();
        }
    }
}
