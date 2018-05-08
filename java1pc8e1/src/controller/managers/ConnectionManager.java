/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.managers;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author student
 */
public class ConnectionManager {
    
    private Connection con;
    
    private ConnectionManager() { 
        String url = "jdbc:mysql://localhost/java1pcurs8";
        String user = "root";
        String pass = "";
        try {
            con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static final class SingletonHolder {
        private static final ConnectionManager SINGLETON = new ConnectionManager();
    }
    
    public static ConnectionManager getInstance() {
        return SingletonHolder.SINGLETON;
    }
    
    public Connection getConnection() {
        return this.con;
    }
}
