package SnakeAndLadderGame.Player;

public class PlayerFactory {
    private int id;
    private String name;

    public Player manufacturePlayer() {
        System.out.println("Enter format code: 1 : id , 2 : id-name, Other : id-name!");
        switch (1) {
            case 1:
                System.out.println("Enter Id!");
                id = 1;
                return new Player(id);
            case 2:
                System.out.println("Enter Id and Name!");
                id = 1;
                name = "Ram";
                return new Player(id, name);
            default:
                System.out.println("Enter Id and Name!");
                id = 1;
                name = "Ram";
                return new Player(id, name);
        }
    }
}
