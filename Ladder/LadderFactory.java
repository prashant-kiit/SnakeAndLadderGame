package SnakeAndLadderGame.Ladder;

public class LadderFactory {
    public Ladder manufacureLadder() {
        System.out.println("Enter id, head and tail");
        int id=1, head = 0, tail = 0;
        return new Ladder(id++, head, tail);
    }
}
