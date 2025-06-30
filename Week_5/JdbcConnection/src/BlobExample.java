
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BlobExample 
{
    public static void main(String[] args) 
    {
        String url="jdbc:oracle:thin:@//localhost:1521/orclpdb";
        String uname="hr";
        String password="hr";
        try
        {
            File f=new File("C:\\Users\\TrueID - 1020\\Downloads\\IMG-20250305-WA0000.jpg");
            FileInputStream fi=new FileInputStream(f);
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection(url, uname, password);
            String query="INSERT INTO person VALUES(?,?,?)";
             PreparedStatement pst=con.prepareStatement(query);
             pst.setString(1,"MyName");
            pst.setInt(2,16);
            pst.setBinaryStream(3, fi);
            int r=pst.executeUpdate();
            if(r==0)
            {
                System.out.println("Record not inserted");
            }
            else
            {
                System.out.println("Record inserted");
            }
            
            pst.close();
            String q="SELECT *FROM person";
            PreparedStatement p=con.prepareStatement(q);
            ResultSet rs=p.executeQuery();
            while(rs.next())
            {
                System.out.println(rs.getString("name")+"   "+rs.getInt("age")+"   "+rs.getBinaryStream("image"));
            }
            rs.close();
            p.close();
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
