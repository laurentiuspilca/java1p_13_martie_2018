import java.util.concurrent.*;

public class Exemplu12 {

    private Semaphore s = new Semaphore(5);
    private int x;
    
    public void increment() {
        try {
            s.acquire();
            x++;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            s.release();
        }
    }
    
    public int get() {
        return x;
    }
    
}