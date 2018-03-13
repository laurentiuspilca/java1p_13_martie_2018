public class Pisica implements java.io.Serializable {
    
    String nume;
    transient String culoare;
    
    public Pisica(String nume, String culoare) {
        this.nume = nume;
        this.culoare = culoare;
    }
}