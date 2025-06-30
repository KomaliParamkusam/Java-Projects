import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class JdbcRowSetExample {
    public static void main(String[] args) throws Exception 
    {
        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
        rowSet.setUrl("jdbc:oracle:thin:@//localhost:1521/orclpdb");
        rowSet.setUsername("hr");
        rowSet.setPassword("hr");
        rowSet.setCommand("SELECT * FROM student");
        rowSet.execute();

        while (rowSet.next()) 
        {
            System.out.println(rowSet.getInt(1) + " - " +
                               rowSet.getString(2));
        }

        rowSet.close();
    }
}
