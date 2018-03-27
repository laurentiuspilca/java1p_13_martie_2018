import java.util.*;

public class Exemplu18 {

    public static void main(String [] args) {
        Locale loc = new Locale("es", "ES");
        
        ResourceBundle bundle = ResourceBundle.getBundle("traducere", loc);
        
        String hello = bundle.getString("txtHello");
        
        System.out.println(hello);
    }
}