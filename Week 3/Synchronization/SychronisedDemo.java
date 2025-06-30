class Counter implements Runnable
{
    int count;
    public synchronized  void increament()
    {
        count++;
    }
    public void run()
    {
        for(int i=1;i<=10000;i++)
        {
           increament();
        }
       
    }
}
public class SychronisedDemo
{
    public static void main(String[] args) throws InterruptedException
    {
        Counter counter=new Counter();
        Thread t1=new Thread(counter);
        Thread t2=new Thread(counter);
        t1.start();
        Thread.sleep(1000);
        t2.start();
        Thread.sleep(1000);
        System.out.println(counter.count);
        
    }
}