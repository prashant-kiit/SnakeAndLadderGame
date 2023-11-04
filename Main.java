package SnakeAndLadderGame;

public class Main {
        public static void main(String[] args) 
        { 
            System.out.println("Welcome!"); 

            System.out.println("Create Players!");
            new PlayerManager().setPlayers();

            System.out.println("Create Board!");
            new BoardManager().setBoard();
        } 
}
