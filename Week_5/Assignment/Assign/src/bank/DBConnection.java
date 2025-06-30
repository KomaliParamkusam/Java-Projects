package bank;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection 
{
    public static Connection setConnection()
    {
        String url="jdbc:oracle:thin:@//localhost:1521/orclpdb";
        String uname="hr";
        String password="hr";
        try
        {
            Connection con=DriverManager.getConnection(url, uname, password);
            return con;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       return null;

    }
}
