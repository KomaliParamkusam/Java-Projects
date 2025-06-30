class Task 
{
    public void printMessage() 
    {
        System.out.println("Method Reference using instance method");
    }
    public static void message()
    {
        System.out.println("Method Reference using static method");
    }
}

public class MethodReferenceExample 
{
    public static void main(String[] args) 
    {
        Task task = new Task();

        Runnable lambdaRunnable = () -> task.printMessage();
        Runnable methodRefRunnable = task::printMessage;
        Runnable staticmethodRefRunnable = Task::message;
        lambdaRunnable.run();
        methodRefRunnable.run();
        staticmethodRefRunnable.run();
    }
}

