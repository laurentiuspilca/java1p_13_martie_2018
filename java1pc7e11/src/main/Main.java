/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
        String url = "jdbc:mysql://localhost/java1pcurs7";
        String user = "root";
        String pass = "";
        
        try (
            Connection con = DriverManager.getConnection(url,user,pass)
        ) {
            String sql = "SELECT * FROM persoane";
            
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                int id = rs.getInt("id");
                String nume = rs.getString("nume");
                String prenume = rs.getString("prenume");
                
                System.out.println(id + " " + nume + " " + prenume);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
