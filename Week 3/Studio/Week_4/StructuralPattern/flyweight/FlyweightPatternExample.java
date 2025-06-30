package flyweight;

public class FlyweightPatternExample 
{
    public static void main(String[] args) 
    {
        ChessBoard arrange=new ChessBoard();
        arrange.addChessPieces(10, 20, "pawn", "white", "Can move one square forward." );
        arrange.addChessPieces(15, 2, "king", "black", "moving diagonally" );
        arrange.addChessPieces(11, 16, "pawn", "white", "Can move one square forward." );
        arrange.addChessPieces(12, 18, "pawn", "black", "Captures diagonally one square forward" );
        arrange.addChessPieces(7, 5, "queen", "white", "moving horizontally" );
        arrange.play();
        
    }
}
