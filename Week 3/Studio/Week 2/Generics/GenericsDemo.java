class Box<T> 
{
    private T item;

    public Box(T item) 
    {
        this.item = item;
    }

    public T getItem() 
    {
        return item;
    }

    public void setItem(T item) 
    {
        this.item = item;
    }
    
    public void showType() {
        System.out.println("Type of T: " + item.getClass().getName());
    }
}

public class GenericsDemo 
{
    public static void main(String[] args) 
    {
        Box<Integer> intBox = new Box<>(10);
        intBox.showType();
        System.out.println("Value: " + intBox.getItem());

        
        Box<String> strBox = new Box<>("Hello");
        strBox.showType();
        System.out.println("Value: " + strBox.getItem());
    }
}

