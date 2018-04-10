import java.util.concurrent.atomic.*;

public class Exemplu14 {

    public static void main(String [] args) {
        //Numar n = new Numar();
        //int x = n.incrementAndGet();
        //System.out.println(x);
        
        AtomicInteger n = new AtomicInteger(0);
        int x = n.incrementAndGet();
        System.out.println(x);
    }
}