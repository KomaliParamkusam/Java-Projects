package prototype;
public class PrototypePatternDemo
{
    public static void main(String[] args)
    {
        Circle c1=new Circle("bLack", 10);
        Circle c2=(Circle) c1.clone();
        c2.setColor("white");
        Rectangle r1=new Rectangle("red", 12.6, 10.3);
        Shape r2=r1.clone();
        c1.draw();
        c2.draw();
        r1.draw();
        r2.draw();

    }
}