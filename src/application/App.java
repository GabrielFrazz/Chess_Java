package application;

import boardgame.Position;
import chess.ChessMatch;

public class App {
    public static void main(String[] args) throws Exception {
        
        Position p = new Position(4, 7);
        System.out.println(p);

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }
}
