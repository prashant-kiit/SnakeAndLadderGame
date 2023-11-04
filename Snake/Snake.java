package SnakeAndLadderGame.Snake;

public class Snake {
    int id;
    int head;
    int tail;

    public Snake(int id, int head, int tail) {
        this.id = id;
        this.head = head;
        this.tail = tail;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getHead() {
        return head;
    }
    public void setHead(int head) {
        this.head = head;
    }
    public int getTail() {
        return tail;
    }
    public void setTail(int tail) {
        this.tail = tail;
    } 
}
