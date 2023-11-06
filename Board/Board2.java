package SnakeAndLadderGame.Board;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Board2 implements IBoard2{
    private Box[] boxs;
    private int TotalBoxes;
   
    public Board2(int TotalBoxes) throws NumberFormatException, IOException {
        setTotalBoxes(TotalBoxes);
        setBoxs(getTotalBoxes());
        for(int i=0; i < TotalBoxes; i++) {
            System.out.println("For Box " + (i+1) + " set Ladder Value ");
            boxs[i].setId(i+1);
            boxs[i].setShiftTo((Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine())));
        }        
    }

    public void setBoxs(int totalBoxes) {
        boxs=new Box[TotalBoxes];
        for (int i = 0; i < totalBoxes; i++) {
            boxs[i] = new Box();
        }
    }
    
    public Box getBoxs(int tempPosition) {
        return boxs[tempPosition];
    }

    public int getTotalBoxes() {
        return TotalBoxes;
    }

    public void setTotalBoxes(int totalBoxes) {
        TotalBoxes = totalBoxes;
    }
}
