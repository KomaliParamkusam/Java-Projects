package bridge;

public class Soldier extends GameCharacters
{

    public Soldier(Weapons w) 
    {
        super(w);
    }

    @Override
    public void character() 
    {
       System.out.print("Soldiers ");
       weapons.attack();
    }
    
}
