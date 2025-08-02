package DataAccessObject;
import java.sql.*;

public class DBConnection {
    static Connection conn = null;
    private DBConnection()
    {        
    }
    
    static public Connection getMySQLConnection()
    {
        try
        {
            if(conn == null)
            {
                Class.forName("com.mysql.cj.jdbc.Driver");          //Class is a class
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/STUDENT_LOGIN_DATABASE","root","meenal@123");
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
            conn = null;
        }
        return conn; 
    }
    
    static public void closeMySQLConnection()
    {
        try
        {
            if(conn!=null)
            {
                conn.close();
                conn=null;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
            conn=null;
        }
    }
    
    public static void main(String... args)
    {
        Connection test = getMySQLConnection();
        if(test != null)
        {
            System.out.println("Connection established");
        }
        else
        {
            System.out.println("Connection Failed");
        }
    }
}
