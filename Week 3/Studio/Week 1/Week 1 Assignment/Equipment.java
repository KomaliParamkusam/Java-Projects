class Equipment
{
    private String brand;
    private int id;
    private String name;
    private double price;
    private int stock;

    public Equipment(String brand, int id, String name, double price, int stock) 
    {
        this.brand = brand;
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public int getId() 
    { 
        return id; 
    }
    public String getName() 
    { 
        return name; 
    }
    public int getStock() 
    { 
        return stock; 
    }
    public void setStock(int stock) 
    {
         this.stock = stock; 
    }

    public void display() 
    {
        System.out.println("[ID: " + id + ", Name: " + name + ", Brand: " + brand +
                ", Price: $" + price + ", Stock: " + stock + "]");
    }
}

