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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operatie o1 = new Patrat(new Dublu(null));
        
        System.out.println(o1.calculeaza(10));  // 400
        
        Operatie o2 = new Dublu(new Patrat(null));
        
        System.out.println(o2.calculeaza(10)); // 200
    }
    
}
