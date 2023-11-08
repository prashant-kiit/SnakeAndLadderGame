package SnakeAndLadderGame.src.OtherDesign;

import java.util.ArrayList;
import java.util.List;

public class ObserverDemo {
    public static class Observer {
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

    public static class Broadcaster {
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

    public static class Viewer {

        public void view() {
            System.out.println("Viewer is watching TV");
        }
    }
}
