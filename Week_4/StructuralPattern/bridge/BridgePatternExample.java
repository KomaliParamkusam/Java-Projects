package bridge;

public class BridgePatternExample 
{
    public static void main(String[] args)
    {
        GameCharacters warrior=new Warrior(new Sword());
        warrior.character();
        GameCharacters archer =new Archer(new Bow());
        archer.character();
        GameCharacters soldier=new Soldier(new Spear());
        soldier.character();
    }
}
