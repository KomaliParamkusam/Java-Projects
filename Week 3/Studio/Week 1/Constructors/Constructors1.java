class A
{
    public A()
    {
        this(10);
        System.out.println("super class no param constructor");
    }
    
    public A(int a) 
    {
        System.out.println("super class int param constructor: "+a);
    }
}

public class Constructors1 extends A
{
	
        public Constructors1() 
        {
            super(100);
            System.out.println("default constructor");
        }
        
        public Constructors1(int a) 
        {
            System.out.println(" parameterized constructor");
        }
        
        public static void main(String[] args) 
        {
            new Constructors1();
            new Constructors1(10);
        }
}
    

