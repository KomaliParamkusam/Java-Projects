import java.sql.Connection;
import java.sql.DriverManager;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class CachedRowSetExample 
{
    public static void main(String[] args) 
    {
        try 
        {
            CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();
            crs.setUrl("jdbc:oracle:thin:@//localhost:1521/orclpdb");
            crs.setUsername("hr");
            crs.setPassword("hr");
            crs.setCommand("SELECT * FROM student");
            crs.execute();  

            while (crs.next()) 
            {
                System.out.println(crs.getInt("sid") + " - " +
                                   crs.getString("sname") + " - " +
                                   crs.getString("grade") + " - " +
                                   crs.getInt("marks"));
            }

            crs.absolute(3);
            crs.updateString("grade", "O");
            crs.updateRow();

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/orclpdb", "hr", "hr");
        con.setAutoCommit(false); 

        
        crs.acceptChanges(con);
            crs.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

