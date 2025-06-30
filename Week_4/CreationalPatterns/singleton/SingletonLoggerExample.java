package singleton;
import java.text.SimpleDateFormat;
import java.util.Date;
class Logger
{
    private volatile static Logger log;
    private Logger()
    {}
    public static Logger getlog()
    {
        if(log==null)
        {
        synchronized(Logger.class)
        {
        if(log==null)
        {
            log=new Logger();
        }
        }
    }
        return log;
    }
    public synchronized void logmessage()
    {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = formatter.format(date);
        for(int i=1;i<=3;i++)
        {
            System.out.println(formattedDate+"--> "+ Thread.currentThread().getName()+ "-> Logging Message "+i+" "+this.toString());
        }
    }
}
class LogThreads implements Runnable
{
    Logger log=Logger.getlog();
    public void run()
    {
       log.logmessage();
    }
}
public class SingletonLoggerExample 
{
    public static void main(String[] args) throws InterruptedException 
    {
        LogThreads obj=new LogThreads();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);
        Thread t3=new Thread(obj);
        t1.start();
       // t1.join();
        t2.start();
       // t2.join();
        t3.start();
    }
}
