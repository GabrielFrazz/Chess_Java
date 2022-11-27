package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{
    private Color color;
    private int moveCount;

    public ChessPiece(Board board, Color color){
        super(board);
        this.color = color;
    }
    
    /**
     * @return Color return the color
     */
    public Color getColor() {
        return color;
    }
 
}