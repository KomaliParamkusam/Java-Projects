import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class CallableStamentFunction 
{
    public static void main(String[] args) 
    {
        
         String url = "jdbc:oracle:thin:@//localhost:1521/orclpdb"; 
        String username = "hr";                 
        String password = "hr";
        try
        {
             Class.forName("oracle.jdbc.driver.OracleDriver");
             Connection conn = DriverManager.getConnection(url, username, password);
             CallableStatement cst=conn.prepareCall("{?=call getAvg(?,?)}");
             cst.setInt(2,101);
             cst.setInt(3,104);
             cst.registerOutParameter(1, Types.INTEGER);
             cst.execute();
             System.out.println("Average marks "+cst.getInt(1));
             cst.close();
             conn.close();
    }
    catch(Exception e)
    {

    }
}
}
