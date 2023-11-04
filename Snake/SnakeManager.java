package SnakeAndLadderGame.Snake;

import java.util.ArrayList;

public class SnakeManager {
    ArrayList<Snake> snakes = new ArrayList<Snake>();

    public SnakeManager() {
        System.out.println("Welcome to Snakes creating module!");
    }

    public ArrayList<Snake> setgetSnakes() {
        System.out.println("Snake creation begins!");
        int s = 1;
        do {
            snakes.add(new SnakeFactory().manufacureSnake());
            System.out.println("Add Another Snake: Yes or No!");
            s = 1; // or s = 0;
        } while (s == 1);
        return snakes;
    }
}
