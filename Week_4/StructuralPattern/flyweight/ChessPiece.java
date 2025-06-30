package flyweight;

public class ChessPiece 
{
    private String pieceType;
    private String color;
    private String movement;
    public ChessPiece(String pieceType, String color, String movement) 
    {
        this.pieceType = pieceType;
        this.color = color;
        this.movement = movement;
    }
    public void move(int row,int column)
    {
        System.out.println("Chess piece Type "+pieceType+" of Color "+color+" moves in direction "+movement+" ( row: "+row+" -  column: "+column+" )");
    }
    
}
