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
public abstract class CarFactory {
    
    public static CarFactory getFactory(Tip t) {
        switch (t) {
            case AUDI: return new AudiFactory();
            case BMW: return new BMWFactory();
            default:
              throw new IllegalArgumentException();
        }
    }
    
    
    public abstract Roata createRoata();
    public abstract Caroserie createCaroserie();
    
    public static enum Tip {
        AUDI, BMW
    }
    
    private static class AudiFactory extends CarFactory {

        @Override
        public Roata createRoata() {
            return new Roata("Audi");
        }

        @Override
        public Caroserie createCaroserie() {
            return new Caroserie("Audi");
        }
        
    }
    
    private static class BMWFactory extends CarFactory {

        @Override
        public Roata createRoata() {
            return new Roata("BMW");
        }

        @Override
        public Caroserie createCaroserie() {
            return new Caroserie("BMW");
        }
        
    }
}
