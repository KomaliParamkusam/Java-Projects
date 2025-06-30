import java.util.Scanner;

class Admin 
{
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "password123";
    private static final Scanner sc = new Scanner(System.in);

    public boolean login() 
    {
        System.out.print("Enter Admin Username: ");
        String username = sc.next();
        System.out.print("Enter Admin Password: ");
        String password = sc.next();

        if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
            System.out.println("************ Admin Login Successful! **************");
            return true;
        } else {
            System.out.println("Invalid Credentials! Access Denied.");
            return false;
        }
    }
}
