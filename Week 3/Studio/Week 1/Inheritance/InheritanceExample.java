
class UserInfo 
{
    protected String username;
    protected String email;

    public UserInfo(String username, String email) 
    {
        this.username = username;
        this.email = email;
    }

    void login() 
    {
        System.out.println(username + " logged in.");
    }
}


class Admins extends UserInfo
{
    public Admins(String username, String email) 
    {
        super(username, email);
    }

    void manageProducts() 
    {
        System.out.println(username + " is managing products.");
    }
}
class Customer extends UserInfo 
{
    public Customer(String username, String email) 
    {
        super(username, email);
    }

    void placeOrder() 
    {
        System.out.println(username + " placed an order.");
    }
}

public class InheritanceExample 
{
        public static void main(String[] args) 
        {
            Admins admin = new Admins(" BharathAdmin ", " admin@gmail.com ");
            admin.login();
            admin.manageProducts();

            Customer customer = new Customer(" Komali ", " komali@gmail.com ");
            customer.login();
            customer.placeOrder();
        }
}

