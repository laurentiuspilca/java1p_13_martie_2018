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
public class Dublu implements Operatie {
    
    private Operatie operatie;
    
    public Dublu(Operatie operatie) {
        this.operatie = operatie;
    }

    @Override
    public int calculeaza(int x) {
        if (operatie != null) {
            x = operatie.calculeaza(x);
        }
        return 2*x;
    }
    
}
