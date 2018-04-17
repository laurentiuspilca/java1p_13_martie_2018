/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.rmi.registry.Registry;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author student
 */
public class MyRegistry {
    private static Map<String, MyRegistry> registry = new HashMap<>();
    
    private MyRegistry() {}
    
    public static MyRegistry getInstance(String key) {
        if (!registry.containsKey(key)) {
            registry.put(key, new MyRegistry());
        }
        
        return registry.get(key);
    }
}
