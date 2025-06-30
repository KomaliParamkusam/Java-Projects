import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcExample {
    public static void main(String[] args) 
    {
        String url = "jdbc:oracle:thin:@//localhost:1521/orclpdb"; 
        String username = "hr";                 
        String password = "hr";                  

        try 
        {
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM empdetails");
            while (rs.next()) 
            {
                System.out.println(rs.getString("empid")+"      "+rs.getString("empname")+"     "+rs.getString("salary"));
            }
            rs.close();
            stmt.close();
            conn.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
