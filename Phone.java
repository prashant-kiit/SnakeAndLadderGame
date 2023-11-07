package SnakeAndLadderGame;

public class Phone {
    private static Phone phone = new Phone();
    private Phone() {}
    
    public static Phone getInstance() {
        return phone;
    }
}