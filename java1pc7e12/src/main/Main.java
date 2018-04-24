/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
            Connection con = DriverManager.getConnection(url, user, pass)
        ) {
            String sql1 = "INSERT INTO produse VALUES (NULL,?,?)";
            PreparedStatement stmt1 = con.prepareStatement(sql1);
            stmt1.setString(1, "bere");
            stmt1.setDouble(2, 5);
            stmt1.executeUpdate();
            
            String sql2 = "SELECT * FROM produse";
            PreparedStatement stmt2 = con.prepareStatement(sql2);
            ResultSet rs = stmt2.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nume = rs.getString("nume");
                double pret = rs.getDouble("pret");
                
                System.out.println(id + " " + nume + " " + pret);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
}
