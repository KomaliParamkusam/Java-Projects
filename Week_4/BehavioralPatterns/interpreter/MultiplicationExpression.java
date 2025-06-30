package Week_4.BehavioralPatterns.interpreter;

public class MultiplicationExpression implements Expression
{
    private Expression left,right;

    public MultiplicationExpression(Expression left, Expression right) 
    {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter()
     {
        return left.interpreter()*right.interpreter();
    }

    

}
