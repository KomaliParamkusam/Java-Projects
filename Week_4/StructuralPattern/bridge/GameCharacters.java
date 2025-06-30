package bridge;

public abstract class GameCharacters 
{
    protected Weapons weapons;
    public GameCharacters(Weapons w)
    {
        this.weapons=w;
    }
    public abstract void character();

}
