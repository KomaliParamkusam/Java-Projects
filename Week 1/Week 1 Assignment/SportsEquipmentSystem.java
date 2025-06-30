import assignment.Admin;
import assignment.Inventory;
import java.util.Scanner;
public class SportsEquipmentSystem 
{
    

    public static void main(String[] args) 
    {
         Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();
        Admin admin = new Admin();

        while (true) 
        {
            System.out.println("--------Welcome to Sports Equipment System---------");
            System.out.println("1. Admin Login");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 2) 
            {
                System.out.println("Thank you for using the system!");
                break;
            }

            if (choice == 1) 
            {
                if (!admin.login()) continue;

                while (true) {
                    System.out.println("\nChoose an Operation:");
                    System.out.println("1. Add Items");
                    System.out.println("2. Sell Items");
                    System.out.println("3. Update Stock");
                    System.out.println("4. Display Inventory");
                    System.out.println("5. Return To Main system");
                    System.out.print("Enter your choice: ");
                    int operation = sc.nextInt();

                    switch (operation) {
                        case 1 -> inventory.addItems();
                        case 2 -> inventory.sellItems();
                        case 3 -> inventory.updateStock();
                        case 4 -> inventory.displayInventory();
                        case 5 -> {
                            System.out.println("Returning to main operations...");
                            continue;
                        }
                        default -> System.out.println("Invalid option, try again.");
                    }
                    if (operation == 5) break;
                }
            } else {
                System.out.println("Invalid choice, try again.");
            }
        }
    }
}

       