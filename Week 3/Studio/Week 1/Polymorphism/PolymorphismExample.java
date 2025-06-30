
abstract class Payment 
{
    double amount;
    
    Payment(double amount) 
    {
        this.amount = amount;
    }

    abstract void makePayment(); 
}
class CreditCardPayment extends Payment 
{
    private String cardNumber;

    CreditCardPayment(double amount, String cardNumber) 
    {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void makePayment() 
    {
        System.out.println("Paid " + amount + " using Credit Card: " + cardNumber);
    }
}


class PayPalPayment extends Payment 
{
    private String email;

    PayPalPayment(double amount, String email) 
    {
        super(amount);
        this.email = email;
    }

    @Override
    void makePayment() 
    {
        System.out.println("Paid " + amount + " using PayPal: " + email);
    }
}

public class PolymorphismExample 
{
    public static void main(String[] args) 
    {
        Payment p1 = new CreditCardPayment(2500, "1234-5678-9012-3456");
        Payment p2 = new PayPalPayment(1500, "trueid.com");
        p1.makePayment();
        p2.makePayment();
    }
}

