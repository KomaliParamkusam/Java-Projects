package assignment;
import java.util.Scanner;

public class Inventory 
{
    private Equipment[] items;
    private static final int MAX_ITEMS = 20;
    private int itemCount;
    private static  Scanner sc = new Scanner(System.in);

    public Inventory() 
    {
        this.items = new Equipment[MAX_ITEMS];
        this.itemCount = 0;
        loadDefaultItems();
    }

    private void loadDefaultItems() 
    {
        addToInventory(new Equipment("Adidas", 101, "Bat", 1500, 20));
        addToInventory(new Equipment("Nike", 102, "Ball", 700, 15));
        addToInventory(new Equipment("Puma", 103, "Helmet", 1200, 10));
        addToInventory(new Equipment("Puma", 201, "Football", 2500.0, 15));
        addToInventory(new Equipment("Adidas", 202, "Goalkeeper Gloves", 1800.0, 10));
        addToInventory(new Equipment("Wilson", 301, "Tennis Racket", 3000.0, 12));
        addToInventory(new Equipment("Babolat", 302, "Tennis Ball", 400.0, 25));
        System.out.println("------ Default Inventory Loaded ------");
    }

    private void addToInventory(Equipment equipment) 
    {
        if (itemCount < MAX_ITEMS) 
        {
            items[itemCount++] = equipment;
        } else 
        {
            System.out.println("Inventory is full. Cannot add more items.");
        }
    }

    public void addItems() 
    {
        if (itemCount >= MAX_ITEMS) 
        {
            System.out.println("Inventory is full. Cannot add more items.");
            return;
        }

        System.out.print("Enter number of items to add: ");
        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < num && itemCount < MAX_ITEMS; i++) {
            System.out.print("Enter Brand: ");
            String brand = sc.nextLine();
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            System.out.print("Enter Stock: ");
            int stock = sc.nextInt();
            sc.nextLine();

            addToInventory(new Equipment(brand, id, name, price, stock));
            System.out.println("Item added successfully!");
        }
    }

    public void sellItems() {
        try {
            System.out.print("Enter the name of the item to sell: ");
            String itemName = sc.next();
            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            for (int i = 0; i < itemCount; i++) {
                if (items[i] != null && items[i].getName().equalsIgnoreCase(itemName)) 
                {
                    if (items[i].getStock() >= quantity) 
                    {
                        items[i].setStock(items[i].getStock() - quantity);
                        System.out.println("Sold " + quantity + " of " + itemName);
                    } else {
                        throw new OutOfStockException("Error: Not enough stock available for " + itemName + "!");
                    }
                    return;
                }
            }
            System.out.println("Item not found in inventory.");
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateStock() 
    {
        System.out.print("Enter the item name to update stock: ");
        String itemName = sc.next();

        for (int i = 0; i < itemCount; i++) 
        {
            if (items[i] != null && items[i].getName().equalsIgnoreCase(itemName)) 
            {
                System.out.print("Enter new stock quantity: ");
                int newStock = sc.nextInt();
                items[i].setStock(items[i].getStock()+newStock);
                System.out.println("Stock updated successfully for " + itemName);
                return;
            }
        }
        System.out.println("Item not found in inventory.");
    }

    public void displayInventory() 
    {
        if (itemCount == 0) {
            System.out.println("No items in inventory.");
            return;
        }
        System.out.println("Available Equipments:");
        System.out.println("=====================================================");
        for (int i = 0; i < itemCount; i++) {
            if (items[i] != null) {
                items[i].display();
            }
        }
        System.out.println("=====================================================");
    }
}
