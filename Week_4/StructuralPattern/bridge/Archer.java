package bridge;

public class Archer extends GameCharacters
{

    public Archer(Weapons w) 
    {
        super(w);
    }

    @Override
    public void character()
    {
        System.out.print("Archer ");
        weapons.attack();
    }
    
}
