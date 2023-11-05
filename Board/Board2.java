package SnakeAndLadderGame.Board;

public class Board2 implements IBoard2{
    private Box[] boxs;
    private int TotalBoxes;
   
    public Board2(int TotalBoxes) {
        setTotalBoxes(TotalBoxes);
        for(int i=0; i < TotalBoxes; i++) {
            System.out.println("For Box " + (i+1) + " set Snake Value ");
            boxs[i].setId(i+1);
            boxs[i].setInc(0);
            boxs[i].setDec(-7); // input
        }        
    }

    public int getTotalBoxes() {
        return TotalBoxes;
    }

    public void setTotalBoxes(int totalBoxes) {
        TotalBoxes = totalBoxes;
    }  
}
