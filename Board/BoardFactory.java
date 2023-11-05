package SnakeAndLadderGame.Board;

public class BoardFactory {
    public IBoard1 manufactureBoard1() {
        System.out.println("Enter No of Boxes in Board!");
        int TotalBoxes=64;
        return new Board1(TotalBoxes);
    }
    public IBoard2 manufactureBoard2() {
        System.out.println("Enter No of Boxes in Board!");
        int TotalBoxes=64;
        return new Board2(TotalBoxes);
    }    
    public IBoard3 manufactureBoard3() {
        System.out.println("Enter No of Boxes in Board!");
        int TotalBoxes=64;
        return new Board3(TotalBoxes);
    } 
}
