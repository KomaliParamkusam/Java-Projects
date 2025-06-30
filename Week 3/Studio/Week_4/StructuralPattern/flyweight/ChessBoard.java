package flyweight;
import java.util.*;
public class ChessBoard 
{
    List<Position> board=new ArrayList<>();
    public void addChessPieces(int row,int column,String pieceType,String color,String movement)
    {
        ChessPiece piece=ChessPieceFactory.getChessPiece(pieceType,color,movement);
        Position position=new Position(row, column, piece);
        board.add(position);
    } 
    public void play()
    {
        for(Position pos:board)
        {
            pos.placePosition();
        }
    }
}
