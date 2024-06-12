
package com.database;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;



public class DbConnect {
    public static Connection connect()
    {
        Connection conn=null;
        
        try {
            Class.forName("org.sqlite.JDBC");
            conn=DriverManager.getConnection("jdbc:sqlite:mydatabase.sqlite");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return conn;
    }
}
