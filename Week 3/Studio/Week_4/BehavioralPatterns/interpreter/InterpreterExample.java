package Week_4.BehavioralPatterns.interpreter;

public class InterpreterExample 
{
    public static Expression parse(String str)
    {
        String[] nums=str.split(" ");
        Expression left=new NumberExpression(Integer.parseInt(nums[0]));
        Expression right=new NumberExpression(Integer.parseInt(nums[2]));
        if(nums[1].equals("add"))
        {
            return new AdditionExpression(left, right);
        }
        else
        {
            return new MultiplicationExpression(left, right);
        }

    }
    public static void main(String[] args) 
    {
        String exp1="10 add 20";
        String exp2="3 mul 30";
        Expression expression1=parse(exp1);
        Expression expression2=parse(exp2);
        System.out.println(exp1+" = "+expression1.interpreter());
        System.out.println(exp2+" = "+expression2.interpreter());
    
    }
}
