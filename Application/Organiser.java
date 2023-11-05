package SnakeAndLadderGame.Application;

import SnakeAndLadderGame.Board.BoardManager;
import SnakeAndLadderGame.Player.PlayerManager;

public class Organiser {

        private static PlayerManager playerManager;
        private static BoardManager boardManager;
        
        public static PlayerManager getPlayerManager() {
            return playerManager;
        }

        public static void setPlayerManager(PlayerManager playerManager) {
            Organiser.playerManager = playerManager;
        }

        public static BoardManager getBoardManager() {
            return boardManager;
        }

        public static void setBoardManager(BoardManager boardManager) {
            Organiser.boardManager = boardManager;
        }

        public static void main(String[] args) 
        { 
            System.out.println("Welcome!"); 

            System.out.println("Create Players!");
            setPlayerManager(new PlayerManager());
            getPlayerManager().setPlayers();
            System.out.println("Players created!");

            System.out.println("Create Board!");
            setBoardManager(new BoardManager());
            getBoardManager().setBoard();
            System.out.println("New Board is created!");
            
            System.out.println("Games Starts!");
            getPlayerManager().play();
            System.out.println("Game Ends!");
        } 
}
