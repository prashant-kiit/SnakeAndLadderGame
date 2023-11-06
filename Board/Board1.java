package SnakeAndLadderGame.Board;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Board1 implements IBoard1 {
    private Box[] boxs;
    private int TotalBoxes;
    public Board1(int TotalBoxes) throws NumberFormatException, IOException {
        setTotalBoxes(TotalBoxes);
        
        setBoxs(getTotalBoxes());
        for(int i=0; i < TotalBoxes; i++) {
            System.out.println("For Box id = " + (i+1) + " set Snake Value and Ladder Value!");
            boxs[i].setId(i+1);
            boxs[i].setInc(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine()));
            boxs[i].setDec(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine()));
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
