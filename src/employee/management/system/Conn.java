
package employee.management.system;

import java.sql.*;      //for Connection c; - interface

public class Conn {
    
    Connection c;
    Statement s;
    
    public Conn(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");      //registering driver class
            c = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem","root","mysql");        //creating the connection string
            s = c.createStatement();        //creating statement
        } catch(Exception e)    {
            e.printStackTrace();
        }
    }
    
}


/*
1.Registering the Driver Class
2.Creating the connection String
3.Creating statement
4.Executing MySql queries
5.Closing the connection
*/