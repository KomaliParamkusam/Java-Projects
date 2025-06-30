package bridge;

public class Warrior extends GameCharacters
{
    public Warrior(Weapons w)
    {
        super(w);
    }

    @Override
    public void character() 
    {
        System.out.print("Warrior ");
        weapons.attack();
    }
    
}
