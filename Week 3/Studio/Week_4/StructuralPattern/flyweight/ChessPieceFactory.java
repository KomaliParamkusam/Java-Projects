package flyweight;
import java.util.*;
public class ChessPieceFactory 
{
    private static final Map<String,ChessPiece> piecesmap=new HashMap<>();
    public static ChessPiece getChessPiece(String pieceType,String color,String movement)
    {
        String key=pieceType+color+movement;
        if(!piecesmap.containsKey(key))
        {
            piecesmap.put(key,new ChessPiece(pieceType, color, movement));
        }
        return piecesmap.get(key);
    }
}
