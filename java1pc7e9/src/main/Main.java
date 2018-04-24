/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost/java1pcurs7";
            String username = "root";
            String password = "";
            
            Connection con = 
                    DriverManager.getConnection(url, username, password);
            
            Statement stmt = con.createStatement();
            
            String sql = "INSERT INTO persoane VALUES (NULL, 'Pop', 'Ion')";
            
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
