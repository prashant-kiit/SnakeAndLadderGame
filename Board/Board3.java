package SnakeAndLadderGame.Board;

public class Board3 implements IBoard3{
    private Box[] boxs;
    private int TotalBoxes;
   
    public Board3(int TotalBoxes) {
        setTotalBoxes(TotalBoxes);
        for(int i=0; i < TotalBoxes; i++) {
            System.out.println("For Box " + (i+1) + " set Ladder Value ");
            boxs[i].setId(i+1);
            boxs[i].setInc(3); // input
            boxs[i].setDec(0); 
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
