package SnakeAndLadderGame.Application;

import java.io.IOException;

import SnakeAndLadderGame.Board.BoardManager;
import SnakeAndLadderGame.Dice.DiceManager;
import SnakeAndLadderGame.Engine.Engine;
import SnakeAndLadderGame.Player.PlayerDiceManager;

public class Organiser {

        private static PlayerDiceManager playerDiceManager;
        private static BoardManager boardManager;
        private static DiceManager diceManager;
        private static Engine engine;
        
        public static PlayerDiceManager getPlayerDiceManager() {
            return playerDiceManager;
        }

        public static void setPlayerDiceManager(PlayerDiceManager playerDiceManager) {
            Organiser.playerDiceManager = playerDiceManager;
        }

        public static BoardManager getBoardManager() {
            return boardManager;
        }

        public static void setBoardManager(BoardManager boardManager) {
            Organiser.boardManager = boardManager;
        }
        
        public static Engine getEngine() {
            return engine;
        }

        public static void setEngine(Engine engine) {
            Organiser.engine = engine;
        } 
        
        public static DiceManager getDiceManager() {
            return diceManager;
        }

        public static void setDiceManager(DiceManager diceManager) {
            Organiser.diceManager = diceManager;
        }

        public static void main(String[] args) throws NumberFormatException, IOException 
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
            
            System.out.println("Create Dice!");
            setDiceManager(new DiceManager());
            getDiceManager().setiDice();
            System.out.println("New Dice is created!");
            
            System.out.println("Games Starts!");
            setEngine(new Engine());
            getEngine().play(getPlayerDiceManager().getPlayers(), getDiceManager().getiDice(), getBoardManager().getiMainBoard());
            System.out.println("Game Ends!");
        }
}
