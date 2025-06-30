import java.util.Scanner;
class FundException extends RuntimeException
{
    public FundException(String message)
    {
        super(message);
    }
}
class Bank
{
    double bal;
    void deposite(double amount)
    {
        if(amount<=0)
        {
            System.out.println("Invalid amount");
        }
        bal+=amount;
        System.out.println("Total Available Balance after deposited: "+bal);
    }
    void withdraw(double money)
    {
        if(money<=0)
        {
            System.out.println("Invalid amount");
        }
        if(money>bal)
        {
            throw new FundException("You have insuffient balance");
        }
        bal-=money;
        System.out.println("Total Available Balance after withdrawl: "+bal);
    }
}
public class CustomException
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double bal=sc.nextDouble();
        Bank obj=new Bank();
        obj.bal=bal;
        System.out.println("Enter the amount to be deposited: ");
        obj.deposite(sc.nextDouble());
        System.out.println("Enter the amount to be withdrawl: ");
        obj.withdraw(sc.nextDouble());
        System.out.println("------------------------");
        System.out.println("Your Total Balanace: "+obj.bal);
        System.out.println("------------------------");

    }
}