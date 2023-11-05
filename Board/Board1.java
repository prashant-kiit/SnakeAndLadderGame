package SnakeAndLadderGame.Board;

public class Board1 implements IBoard1 {
    private Box[] boxs;
    private int TotalBoxes;
   
    public Board1(int TotalBoxes) {
        setTotalBoxes(TotalBoxes);
        for(int i=0; i < TotalBoxes; i++) {
            System.out.println("For Box " + (i+1) + " set Snake Value and Ladder Value!");
            boxs[i].setId(i+1);
            boxs[i].setInc(7); // input
            boxs[i].setDec(-3); // input
        }        
    }

    public int getTotalBoxes() {
        return TotalBoxes;
    }

    public void setTotalBoxes(int totalBoxes) {
        TotalBoxes = totalBoxes;
    }

    public Box getBoxs(int tempPosition) {
        return boxs[tempPosition];
    }
}
