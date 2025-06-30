
interface Greeting 
{
    void sayHello(String name);
}

class Greeter 
{
   
    public void greet(String name) 
    {
        System.out.println("Hello, " + name + "!");
    }
}

public class UserDefinedMethodReference 
{
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        Greeting lambdaGreeting = (name) -> greeter.greet(name);
        Greeting methodRefGreeting = greeter::greet;

        lambdaGreeting.sayHello("Komali");
        methodRefGreeting.sayHello("Bharath");
    }
}
