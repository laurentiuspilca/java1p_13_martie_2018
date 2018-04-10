import java.util.concurrent.*;

public class Exemplu3 {

    public static void main(String [] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        
        service.execute(
            () -> System.out.println(
                Thread.currentThread().getName() + " Hello"));
                
        service.execute(
            () -> System.out.println(
                Thread.currentThread().getName() + " World"));
        
        service.shutdown(); // service.shutdownNow()
    }
}