package Week_4.BehavioralPatterns.interpreter;

public class NumberExpression implements Expression
{
    private int number;

    public NumberExpression(int number) 
    {
        this.number = number;
    }
    

    @Override
    public int interpreter() 
    {
        return number;
    }
    
}
