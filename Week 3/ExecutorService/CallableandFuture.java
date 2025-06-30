import java.util.concurrent.*;

class MyTask implements Callable<Integer> 
{
    @Override
    public Integer call() throws Exception 
    {
        System.out.println("Task is running in thread: " + Thread.currentThread().getName());
        Thread.sleep(2000);  
        return 10 + 20;  
    }
}

public class CallableandFuture
{
    public static void main(String[] args) 
    {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new MyTask());
        
        try 
        {
            System.out.println("Waiting for the result...");
            Integer result = future.get();
            System.out.println("Task Result: " + result);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        finally 
        {
            executor.shutdown();
        }
    }
}
