public class Pisica {
    private String nume;
    private String culoare;
    
    public Pisica(String nume, String culoare) {
        this.nume = nume;
        this.culoare = culoare;
    }
    
    public void setNume(String nume) {
        this.nume = nume;
    }
    
    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
    
    public String getNume() {
        return this.nume;
    }
    
    public String getCuloare() {
        return this.culoare;
    }
}