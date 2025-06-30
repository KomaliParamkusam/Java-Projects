import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SecureData_EncryDecryp 
{
    public static void main(String[] args) 
    {
        String url="jdbc:oracle:thin:@//localhost:1521/orclpdb";
        String uname="hr";
        String password="hr";
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection(url, uname, password);
            String query="INSERT INTO secure_data(data_id,data_name,password) VALUES(?,?,?)";
            // PreparedStatement ps=con.prepareStatement(query);
            // String psw1="mypassword";
            // String encrypted=EncryptionDecryption.encrypt(psw1);
            // ps.setInt(1,601);
            // ps.setString(2, "Soldier Info");
            // ps.setString(3, encrypted);
            // int row=ps.executeUpdate();
            // if(row==1)
            // {
            //     System.out.println("Inserted successfully");
            // }
            // ps.close();
            String q="SELECT *FROM secure_data";
            PreparedStatement p=con.prepareStatement(q);
            ResultSet rs=p.executeQuery();
          
            while(rs.next())
            {
                int id=rs.getInt("data_id");
                String name=rs.getString("data_name");
                String decrypt=rs.getString("password");
                String originalPassword=EncryptionDecryption.decrypt(decrypt);
                System.out.println(id+"-----"+name+"------"+originalPassword);
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
