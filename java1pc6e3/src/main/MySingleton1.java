/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author student
 */
public class MySingleton1 {
    private static MySingleton1 singleton;
    
    private MySingleton1() {
        
    }
    
    public static MySingleton1 getInstance() {
        if (singleton == null) {
            synchronized (MySingleton1.class) {
                if (singleton == null) {
                    singleton = new MySingleton1();
                }
            }
        }
        return singleton;
    }
}
