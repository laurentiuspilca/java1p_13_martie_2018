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
public final class OperatieFactory {
    
    public static Operatie getOperatie(Type type) {
        switch (type) {
            case ADUNARE: return new Adunare();
            case PRODUS: return new Produs();
        }
        
        throw new IllegalArgumentException();
    }
    
    public static enum Type {
        ADUNARE, PRODUS
    }
}
