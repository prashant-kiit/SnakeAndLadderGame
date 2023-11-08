package SnakeAndLadderGame.src.OtherDesign;

public class SingletonDemo {
    public static class Singleton {

        public static void main(String[] args) {
            Phone.getInstance();
        }
    }

    public static class Phone {
        private static Phone phone = new Phone();
        private Phone() {}

        public static Phone getInstance() {
            return phone;
        }
    }
}
