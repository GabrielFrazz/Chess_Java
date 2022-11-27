package application;

import boardgame.Board;
import boardgame.Position;

public class App {
    public static void main(String[] args) throws Exception {
        
        Position p = new Position(4, 7);
        System.out.println(p);

        Board board = new Board(8, 8);
    }
}
