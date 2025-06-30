
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable
{
    String Taskname;
    public Task(String Taskname)
    {
        this.Taskname=Taskname;
    }
    public void run()
    {
        System.out.println(Thread.currentThread().getName() +" is executing "+Taskname);
        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException i)
        {
            System.out.println(Taskname+" is interrupted ");
        }
        System.out.println(Taskname+" is completed ");
    }
}
public class ExecutorServiceExample
{
    public static void main(String[] args) 
    {
        ExecutorService executor=Executors.newFixedThreadPool(3);
        for(int i=1;i<=6;i++)
        {
           Task task=new Task("Task"+i);
           executor.submit(task);
        }
        executor.shutdown();

    }
}