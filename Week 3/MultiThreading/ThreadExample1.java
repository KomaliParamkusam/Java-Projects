class RangeT extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Thread1 Execution");
        for(int i=1;i<=10;i++)
        {
            System.out.print(i+" ");
            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException e)
            {
            }
        }
        System.out.println();
    }
}
class EvenT extends Thread
{
    int count=0;
    @Override
    public void run()
    {
        System.out.println("Thread2 Execution");
            for(int i=1;;i++)
            {
                if(i%2==0)
                {
                    System.out.print(i+" ");
                    count++;
                }
                if(count==10)
                {
                    break;
                }
                try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException e)
            {
            }
            }
            System.out.println();
        
    }
}
class OddT extends Thread
{
    int count=0;
    @Override
    public void run() 
    {
        System.out.println("Thread3 Execution");
            for(int i=1;;i++)
            {
                if(i%2==1)
                {
                    System.out.print(i+" ");
                    count++;
                }
                if(count==10)
                {
                    break;
                }
                try
                {
                    Thread.sleep(100);
                }
                catch(InterruptedException e)
                {
                }
                
            }
            System.out.println();
        
    }
}
public class ThreadExample1
{
    static RangeT t1=new RangeT();
    static EvenT t2=new EvenT();
    static OddT t3=new OddT();
    public static void main(String[] args) throws InterruptedException
    {
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        System.out.println(Thread.currentThread());
    }
}