package SnakeAndLadderGame;

public class BoardFactory {
    public IBoard manufactureBoard() {
        System.out.println("Enter board type code: 1 : Rectangle , 2 : Sqaure");
        int s=1;
        switch (s) {
            case 1:
                System.out.println("Creating Rectangle Board!");
                return new RectangleBoard();
            case 2:
                System.out.println("Creating Square Board!");
                return new SquareBoard();
            default:
                System.out.println("Wrong Option. Creating Square Board!");
                return new SquareBoard();
        }
    }
}
