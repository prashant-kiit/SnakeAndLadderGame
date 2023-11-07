package SnakeAndLadderGame;

public class Observer {
    public static void main(String[] args) {
        Viewer v1 = new Viewer();
        Viewer v2 = new Viewer();
        Viewer v3 = new Viewer();
        Broadcaster broadcaster = new Broadcaster();
        broadcaster.addViewer(v1);
        broadcaster.addViewer(v2);
        broadcaster.addViewer(v3);

        broadcaster.broadcast();
    }
}
