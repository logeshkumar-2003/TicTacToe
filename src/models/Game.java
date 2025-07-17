package models;

//import jdk.internal.org.objectweb.asm.tree.InsnList;
import models.Board;
import models.GameState;
import models.Player;
import strategy.WinningStrategy;
//import lombok.Getter;
//import lombok.Setter;

import java.util.List;

//@Getter
//@Setter
public class Game {
    private Board board;

    private List<Player> playersList;

    private GameState gameState;

    private Player winner;

    private int nextMovePlayerIndex;

    private List<WinningStrategy> winningStrategies;


    public Game(Board board, List<Player> playersList,List<WinningStrategy> winningStrategies) {
        this.playersList = playersList;
        this.gameState= GameState.INPROGRESS;
        this.nextMovePlayerIndex=0;
        this.board=board;
        this.winningStrategies=winningStrategies;
    }

    public GameState getGameState() {
        return gameState;
    }

    public Player getWinner() {
        return winner;
    }

    public Board getBoard() {
        return board;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return this.winningStrategies;
    }

    public void setGameState(GameState gameState) {
        this.gameState=gameState;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public List<Player> getPlayersList() {
        return this.playersList;
    }

    public void setPlayersList(List<Player> playersList) {
        this.playersList = playersList;
    }

    public int getNextMovePlayerIndex() {
        return nextMovePlayerIndex;
    }

    public void setNextMovePlayerIndex(int nextMovePlayerIndex) {
        this.nextMovePlayerIndex = nextMovePlayerIndex;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies=winningStrategies;
    }
}
