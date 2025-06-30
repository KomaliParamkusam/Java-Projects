package prototype;

public class Rectangle implements Shape
{
    private String color;
    private double height;
    private double width;
    public Rectangle(String color, double height, double width) 
    {
        this.color = color;
        this.height = height;
        this.width = width;
    }
    public String getColor() 
    {
        return color;
    }
    public void setColor(String color) 
    {
        this.color = color;
    }
    public double getHeight() 
    {
        return height;
    }
    public void setHeight(double height) 
    {
        this.height = height;
    }
    public double getWidth() 
    {
        return width;
    }
    public void setWidth(double width) 
    {
        this.width = width;
    }
    public Shape clone()
    {
        return new Rectangle(color, height, width);
    }
    public void draw()
    {
        System.out.println("Rectangle is in the color "+color+" with height "+height+" and width "+width);
    }
}
