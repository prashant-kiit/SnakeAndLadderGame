package SnakeAndLadderGame;

import java.util.ArrayList;
import java.util.List;

public class Broadcaster {
    private List<Viewer> viewers = new ArrayList<Viewer>();

    public void addViewer(Viewer v1) {
        viewers.add(v1);
    }

    public void broadcast() {
        for (Viewer viewer : viewers ) {
            viewer.view();
        }
    }
}
