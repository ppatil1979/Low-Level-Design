package tictactoe.controllers;

import tictactoe.models.Board;
import tictactoe.models.Game;
import tictactoe.models.Player;

import java.util.List;

public class GameController {
    // GameController implementation
   public static Game gameController(int size, List<Player> players) {
       Game game = Game.startGame().
               setBoard(new Board(size))
               .setPlayers(players)
               .build();
       return game;
   }
}
