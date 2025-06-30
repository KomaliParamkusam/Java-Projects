class Resource
{
    String name;

    public Resource(String name) 
    {
        this.name=name;
    }
    
}
public class DeadlockExample
{
    public static void main(String[] args) 
    {
        Resource A=new Resource("ResourceA");
        Resource B=new Resource("ResourceB");
        Thread t1=new Thread(()-> { 
        synchronized (A)
        {
            System.out.println("T1 Resorce of A"+A.name);
            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException e){}
            synchronized(B)
            {
                System.out.println("T1 Resorce of B"+B.name);
            }
        } 
    });
    Thread t2=new Thread(()-> { 
        synchronized (B)
        {
            System.out.println("T2 Resorce of B"+B.name);
            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException e){}
            synchronized(A)
            {
                System.out.println("T2 Resorce of A"+A.name);
            }
        } 
    });
    t1.start();
    t2.start();
  }
}
