package pack2;
import java.util.concurrent.Callable;
public class Eligibility implements Callable<User>
{
     User user;

    public Eligibility(User user) 
    {
        this.user = user;
    }

    public User call() 
    {
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        user.checkEligibility();
        System.out.println("Updated Eligibility for: " + user.getUname());
        return user;
    }
}
