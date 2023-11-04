package SnakeAndLadderGame.Snake;

public class SnakeFactory {
    public Snake manufacureSnake() {
        System.out.println("Enter id, head and tail");
        int id=1, head = 0, tail = 0;
        return new Snake(id++, head, tail);
    }
}
