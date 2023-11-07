package SnakeAndLadderGame.Application;

import java.io.IOException;

import SnakeAndLadderGame.Board.BoardManager;
import SnakeAndLadderGame.Engine.Engine;
import SnakeAndLadderGame.Player.PlayerDiceManager;

public class OrganiserFacade {

        private  PlayerDiceManager playerDiceManager;
        private  BoardManager boardManager;
        private  Engine engine;
        
        public  PlayerDiceManager getPlayerDiceManager() {
            return playerDiceManager;
        }

        public  void setPlayerDiceManager(PlayerDiceManager playerDiceManager) {
            this.playerDiceManager = playerDiceManager;
        }

        public  BoardManager getBoardManager() {
            return boardManager;
        }

        public  void setBoardManager(BoardManager boardManager) {
            this.boardManager = boardManager;
        }
        
        public  Engine getEngine() {
            return engine;
        }

        public  void setEngine(Engine engine) {
            this.engine = engine;
        } 

        public void launch() throws NumberFormatException, IOException 
        { 
            System.out.println("Welcome!"); 

            System.out.println("Create Players!");
            setPlayerDiceManager(new PlayerDiceManager());
            getPlayerDiceManager().setPlayers();
            System.out.println("Players created!");

            System.out.println("Create Board!");
            setBoardManager(new BoardManager());
            getBoardManager().setiMainBoard();
            System.out.println("New Board is created!");
            
            System.out.println("Games Starts!");
            setEngine(new Engine());
            getEngine().play(getPlayerDiceManager().getPlayers(), getBoardManager().getiMainBoard());
            System.out.println("Game Ends!");
        }
}
