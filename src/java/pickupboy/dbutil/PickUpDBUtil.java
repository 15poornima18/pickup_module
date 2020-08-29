package pickupboy.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PickUpDBUtil {
    private static Connection conn;
    static{
        try{
            Class.forName("oracle.jdbc.OracleDriver");
         
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//DESKTOP-T54D745:1521/XE","minor_project", "mca3");
             
            System.out.println("Connection opened!");
          
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        
        return conn;
    } 
     public static void CloseConnection()
    {
        try{
            conn.close();
            System.out.println("Connection closed!");
        }
        catch(SQLException e)
        {
        
         e.printStackTrace();     
        }
   
    }

}