class MultiplicationT implements Runnable
{
    @Override
    public void run() 
    {
        int num=10;
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+" x "+i+" = "+(num*i));
            try
            {
                Thread.sleep(200);
            }
            catch(InterruptedException e)
            {}
        }
    }
}
class FactT implements Runnable
{
    @Override
    public void run()
    {
        int num=6,fact=1,c=0;
        for(int i=num;i>=1;i--)
        {
            if(c==0)
            {
             System.out.print(i);
             c++;
            }
            else
            {
                System.out.print(" x "+i);
            }
            fact=fact*i;
        }
       
        System.out.print(" = "+fact);
        System.out.println();
    }
}
class FiboT implements Runnable
{
    @Override
    public void run()
    {
        int a=0,b=1,cnt=0;
        while(cnt<10)
        {
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
            cnt++;
            try
            {
                Thread.sleep(200);
            }
            catch(InterruptedException e)
            {}
        }
        System.out.println();
    }
}
public class RunnableExample1
{
    public static void main(String[] args) throws InterruptedException
    {
        MultiplicationT mul=new MultiplicationT();
        FiboT f=new FiboT();
        FactT fa=new FactT();
        Thread t1=new Thread(mul);
        Thread t2=new Thread(f);
        Thread t3=new Thread(fa);
        t1.start();
        t1.sleep(3000); //t1.join();
        t2.start();
        t2.sleep(3000); //t2.join();
        t3.start();

    }
}