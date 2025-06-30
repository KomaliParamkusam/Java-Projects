import java.util.Scanner;
class InsuffientFund extends RuntimeException
{
    InsuffientFund(String message)
    {
        super(message);
    }
}
class BankAccount
{
    double Bal;
    public synchronized void deposite(double money)
    {
        if(money<=0)
        {
            System.out.println("Invalid deposite amount");
            return;
        }
        Bal=Bal+money;
        System.out.println(" Balance deposite "+money+" total balane "+Bal);

    }
    public synchronized void withdraw(double amount)
    {
        if(amount<=0)
        {
            System.out.println("Invalid deposite amount");
            return;
        }

        if(Bal<amount)
        {
            throw new InsuffientFund("No suffient Amount");
        }
        Bal=Bal-amount;
        System.out.println(" Balance Withdraw "+amount+" total balane "+Bal);
    }
}
class MyThreadDepo extends Thread
{
    BankAccount b;
    MyThreadDepo(BankAccount b)
    {
        this.b=b;
    }
    @Override
    public void run()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount to be deposite");
        double money=sc.nextDouble();
        b.deposite(money);
    }
}
class MyThreaddraw extends Thread
{
    BankAccount b;
    MyThreaddraw(BankAccount b)
    {
        this.b=b;
    }
    @Override
    public void run() throws InsuffientFund
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount to be withdraw");
        double amount=sc.nextDouble();
        b.withdraw(amount);
    }
}
public class SynchronizedExample
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException
    {
        BankAccount bank=new BankAccount();
        System.out.println("Enter The Balance");
        double bal=sc.nextDouble();
        bank.Bal=bal;
        MyThreadDepo t1=new MyThreadDepo(bank);
        MyThreaddraw t2=new MyThreaddraw(bank);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        System.out.println("Current balance: "+bank.Bal);
    }
}