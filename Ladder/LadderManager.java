package SnakeAndLadderGame.Ladder;

import java.util.ArrayList;

public class LadderManager {
    ArrayList<Ladder> ladders = new ArrayList<Ladder>();

    public LadderManager() {
        System.out.println("Welcome to Ladder creating module!");
    }

    public ArrayList<Ladder> setgetLadders() {
        System.out.println("Ladder creation begins!");
        int s = 1;
        do {
            ladders.add(new LadderFactory().manufacureLadder());
            System.out.println("Add Another Ladder: Yes or No!");
            s = 1; // or s = 0;
        } while (s == 1);
        return ladders;
    }
}
