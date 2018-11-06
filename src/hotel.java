import java.sql.*;
import javax.swing.*;
public class hotel {
    Connection conn=null;
    public static Connection dbconnect(){ 
    
  
    try
    {
    Class.forName("org.sqlite.JDBC");
    Connection conn=DriverManager.getConnection("jdbc:sqlite:I:\\Java\\OOP_Project\\databases\\hotel.sqlite");
    //JOptionPane.showMessageDialog(null ,"connected");
    return conn;
}catch(Exception e){
    JOptionPane.showMessageDialog(null ,e);
    return null;
}
}
}
