
class Example implements Cloneable
{
    String message;
    int a;
    public Example() 
    {
        this.message = "Default Constructor Called!";
    }

    public Example (String message) 
    {
        this.message = message;
    }

   
    public void display() 
    {
        System.out.println(message +" "+a);
    }
    protected Object clone()  throws CloneNotSupportedException
    {
        return super.clone();
    }
}

public class ObjectCreationExample 
{
    public static void main(String[] args) throws CloneNotSupportedException,ClassNotFoundException,InstantiationException,IllegalAccessException
    {
        
            
            Example obj1 = new Example("Object created using 'new' keyword");
            obj1.a=10;
            obj1.display();
            Class<?> c=Class.forName("Example");
            Example obj2=(Example)c.newInstance();
            String message="Object created using Class.forname method";
            obj2.message=message;
            obj2.display();
            Example obj3 = (Example) obj1.clone();
            //obj3.message = "Object created using Cloning";
            obj3.a=100; 
            obj3.display();
            obj1.display();
        }
}


