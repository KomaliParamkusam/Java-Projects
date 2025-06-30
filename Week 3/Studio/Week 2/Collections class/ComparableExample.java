import java.util.*;

class Product implements Comparable<Product> 
{
    int id;
    String name;
    double price;

   
    public Product(int id, String name, double price) 
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    
    @Override
    public int compareTo(Product p) {
        return Double.compare(this.price, p.price); 
    }

    
    @Override
    public String toString() {
        return "Product[ID=" + id + ", Name=" + name + ", Price=$" + price + "]";
    }
}

public class ComparableExample 
{
    public static void main(String[] args) 
    {
      
        List<Product> products = new ArrayList<>();
        products.add(new Product(201, "Laptop", 750.99));
        products.add(new Product(202, "Smartphone", 499.49));
        products.add(new Product(203, "Tablet", 299.99));
        products.add(new Product(204, "Smartwatch", 199.99));

       
        System.out.println("Before Sorting:");
        for (Product p : products) {
            System.out.println(p);
        }

       
        Collections.sort(products);

        
        System.out.println("After Sorting (by Price in Ascending Order):");
        for (Product p : products) 
        {
            System.out.println(p);
        }
    }
}

