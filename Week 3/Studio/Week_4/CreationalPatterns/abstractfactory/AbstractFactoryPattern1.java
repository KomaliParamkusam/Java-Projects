package abstractfactory;
interface Savings
{
    void account();
}
interface Current
{
    void account();
}

class BankOfAmericaSavings implements Savings
{
    
    public void account()
    {
        System.out.println("----------Bank of America Savings Account----------");
        System.out.println("Bank Of America Standard Annual Percentage Yield in Savings account is 0.01%");
    }
    
}
class AxisSavings implements Savings
{
    public void account()
    {
        System.out.println("------------Axis Savings Account----------");
        System.out.println("Axis Bank Standard Annual Percentage Yield in Savings account is 4.86%");
    }
}
class BankOfAmericaCurrent implements Current
{
    public void account()
    {
        System.out.println("---------------Bank of America Current Account--------");
        System.out.println(""" 
                               Bank Of America current account offers Benefits like

                               Online and mobile banking 

                               Direct deposit 

                               Bill pay

                               Potentially rewards programs like BankAmeriDeals and Preferred Rewards,
                               """);
    }
}
class AxisCurrent implements Current
{
    public void account()
    {
        System.out.println("----------Axis current Account-----------");
        System.out.println("""
                        An Axis Bank Current Account offers businesses enhanced convenience, 
                        facilitating frequent transactions with unlimited deposits and withdrawals,
                         along with access to digital banking and potential overdraft facilities. """);
    }
}
abstract class AccountFactory 
{
    abstract Savings accessSavingsAccount();
    abstract Current accessCurrentAccount();
}
class BankOfAmerica extends  AccountFactory
{
    public Savings accessSavingsAccount()
    {
        return new BankOfAmericaSavings();
    }
    public Current accessCurrentAccount()
    {
        return new BankOfAmericaCurrent();
    }
}
class Axis extends  AccountFactory
{
    public Savings accessSavingsAccount()
    {
        return new AxisSavings();
    }
    public Current accessCurrentAccount()
    {
        return new AxisCurrent();
    }
}
public class AbstractFactoryPattern1 
{
    private Savings savings;
    private Current current;
    public AbstractFactoryPattern1(AccountFactory factory)
    {
        savings=factory.accessSavingsAccount();
        current=factory.accessCurrentAccount();
    }
    void details()
    {
        savings.account();
        current.account();
    }
    public static void main(String[] args) 
    {
        AbstractFactoryPattern1 obj=new AbstractFactoryPattern1(new Axis());
        obj.details();
    }
}
