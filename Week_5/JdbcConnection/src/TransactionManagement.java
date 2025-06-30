import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Savepoint;

public class TransactionManagement 
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
            con.setAutoCommit(false);
            String hikeSalary="UPDATE empdetails SET salary=salary+? WHERE empid=?";
            PreparedStatement hikestmnt=con.prepareStatement(hikeSalary);
            hikestmnt.setInt(1, 15000);
            hikestmnt.setInt(2, 1045);
            hikestmnt.executeUpdate();
            Savepoint savepoint1=con.setSavepoint("Successfully_salary_hiked");
            String decSalary="UPDATE empdetails SET salary=salary-? WHERE empid=?";
            PreparedStatement decstmnt=con.prepareStatement(decSalary);
            decstmnt.setInt(1, 5000);
            decstmnt.setInt(2, 205);
            decstmnt.executeUpdate();
            Savepoint savepoint2=con.setSavepoint("Successfully_salary_reduced");
            con.rollback(savepoint1);
            con.commit();
            String selectq="SELECT *FROM empdetails";
            PreparedStatement selectstmnt=con.prepareStatement(selectq);
            ResultSet res=selectstmnt.executeQuery();
            while(res.next())
            {
                System.out.println(res.getString("empid")+" - "+res.getString("empname")+" - "+res.getString("salary")+" - "+res.getString("email"));
            }
            res.close();
            selectstmnt.close();
            decstmnt.close();
            hikestmnt.close();
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
