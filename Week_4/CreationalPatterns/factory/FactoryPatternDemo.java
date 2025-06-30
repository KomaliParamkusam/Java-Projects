package factory;
import java.util.Scanner;
interface Payment
{
    void processPayment();
}
class CreditCardPayment implements Payment
{
    @Override
    public void processPayment()
    {
        System.out.println("Processing your payment through Credit Card");
    }
}
class DebitCardPayment implements Payment
{
    @Override
    public void processPayment()
    {
        System.out.println("Processing your payment through Debit Card");
    }
}
class UPIPayment implements Payment
{
    @Override
    public void processPayment()
    {
        System.out.println("Processing your payment through UPI");
    }
}
class NetBankingPayment implements Payment
{
    @Override
    public void processPayment()
    {
        System.out.println("Processing your payment through NetBanking");
    }
}
class PaymentFactory
{
    public static Payment PaymentMethod(String name) throws IllegalArgumentException
    {
        if(name==null)
        {
            return null;
        }
        switch (name.toLowerCase()) 
        {
            case "credit" -> {
                return new CreditCardPayment();
            }
            case "debit" -> {
                return new DebitCardPayment();
            }
            case "upi" -> {
                return new UPIPayment();
            }
            case  "netbanking" -> {
                return new NetBankingPayment();
            }
            default -> throw new IllegalArgumentException();
        }
    }

}

public class FactoryPatternDemo 
{
    public static void main(String[] args) throws IllegalArgumentException
    {
        Scanner sc=new Scanner(System.in);
        /*System.out.println("""
                           1 Credit Card Payment

                           2 Debit Card Payment
                           
                           3 UPI Payment
                           
                           4 Net Banking Payment"""
        );
                        System.out.println();
        System.out.print("Enter your choice of Payment: ");
        int n=sc.nextInt();
        sc.nextLine();
        switch (n) 
        {
            case 1 -> 
            {
                Payment credit=PaymentFactory.PaymentMethod("credit");
                credit.processPayment();
            }
            case 2 -> 
            {
                Payment debit=PaymentFactory.PaymentMethod("debit");
                debit.processPayment();
            }
            case 3 -> 
            {
                Payment upi=PaymentFactory.PaymentMethod("upi");
                upi.processPayment();
            }
            case 4 -> 
            {
                Payment netbank=PaymentFactory.PaymentMethod("netbanking");
                netbank.processPayment();
            }
            default -> System.out.println("Cash on Delivery");
        }
        sc.close();*/
        String name=sc.nextLine();
        Payment object=PaymentFactory.PaymentMethod(name);
                object.processPayment();

    }
}
