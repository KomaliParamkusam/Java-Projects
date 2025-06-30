class Counter1 
{
    int countvar;
    void increament()
    {
        synchronized (this) 
        {
            countvar++;
        }
    }

}
public class SynchronizedBlockExample
{
    public static void main(String[] args) throws InterruptedException
    {
        Counter1 counting=new Counter1();
        Thread t1=new Thread(()->
        {
            for(int i=1;i<=10000;i++)
            {
                counting.increament();
            }
        });
        Thread t2=new Thread(()->
        {
            for(int i=1;i<=10000;i++)
            {
                counting.increament();
            }
        });
        t1.start();
        t2.start();
       t1.join();
        t2.join();
        System.out.println(counting.countvar);
    }
}