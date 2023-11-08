package SnakeAndLadderGame.src.Board;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BoardFactory {
    public IBoard1 manufactureBoard1() throws NumberFormatException, IOException {
        System.out.println("Enter No of Boxes in Board!");
        int TotalBoxes = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        return new Board1(TotalBoxes);
    }
    public IBoard2 manufactureBoard2() throws NumberFormatException, IOException {
        System.out.println("Enter No of Boxes in Board!");
        int TotalBoxes = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        return new Board2(TotalBoxes);
    }    
    public IBoard3 manufactureBoard3() throws NumberFormatException, IOException {
        System.out.println("Enter No of Boxes in Board!");
        int TotalBoxes = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        return new Board3(TotalBoxes);
    } 
}
