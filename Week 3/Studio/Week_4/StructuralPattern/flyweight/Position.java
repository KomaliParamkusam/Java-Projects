package flyweight;

public class Position 
{
    private int row;
    private int column;
    private ChessPiece piece;
    public Position(int row, int column, ChessPiece piece) 
    {
        this.row = row;
        this.column = column;
        this.piece = piece;
    }
    public void placePosition()
    {
        piece.move(row, column);
    }
}
