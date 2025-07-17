package services;

import java.util.List;
import models.Board;
import models.Game;
import models.GameState;
import models.Player;
import strategy.WinningStrategy;

public class GameService {

    public Game startGame(int rowLength,int columnLength,List<Player>playerList,List<WinningStrategy> winningStrategies){

        Board board=new Board(rowLength,columnLength);
        Game game=new Game(board,playerList,winningStrategies);
        return game;

    }

    public void makeMove(Game game, int row, int column, Player player) {
        final Board board = game.getBoard();
        board.getCells().get(row).get(column).setPlayer(player);
        List<WinningStrategy> winningStrategies = game.getWinningStrategies();
        for (WinningStrategy strategy : winningStrategies) {
            strategy.registerMove(player, row, column);
            if (strategy.isWinningMove(player, row, column)) {
                game.setGameState(GameState.COMPLETED);
                game.setWinner(player);
                return;
            }
        }
    }

}
