package prototype;

public class Circle implements Shape
{
    private String color;
    private int radius;
    public Circle(String color, int radius) 
    {
        this.color = color;
        this.radius = radius;
    }
    
    public String getColor() 
    {
        return color;
    }

    public void setColor(String color) 
    {
        this.color = color;
    }

    public int getRadius() 
    {
        return radius;
    }

    public void setRadius(int radius) 
    {
        this.radius = radius;
    }

    public Shape clone()
    {
        return new Circle(color, radius);
    }
    public void draw()
    {
        System.out.println("Circle is in the color "+color+" with the radius of "+radius);
    }
    
}
