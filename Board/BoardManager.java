package SnakeAndLadderGame.Board;

public class BoardManager {
    private IMainBoard iMainBoard;
    private String boardType;

    public BoardManager() {
        System.out.println("Welcome to Board Manager Module!");
    }

    public void setBoard() {
        System.out.println("Select the type of Board!");
        boardType="Type1";
        System.out.println("Creating new Board of Type " + boardType + "!");
        iMainBoard=new BoardFactoryController().chooseBoard(boardType);
        System.out.println("New Board is created!");
    }

    public IMainBoard getiMainBoard() {
        return iMainBoard;
    }

    public void setiMainBoard(IMainBoard iMainBoard) {
        this.iMainBoard = iMainBoard;
    }

    public String getBoardType() {
        return boardType;
    }

    public void setBoardType(String boardType) {
        this.boardType = boardType;
    }
    
}
