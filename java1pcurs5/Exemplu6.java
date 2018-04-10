import java.util.concurrent.*;

public class Exemplu6 {

    public static void main(String [] args) throws Exception {
        ScheduledExecutorService service = 
            Executors.newSingleThreadScheduledExecutor();
            
        service.schedule(() -> System.out.println("HELLO"), 5, TimeUnit.SECONDS);
        
        Thread.sleep(10000);
        
        service.shutdown();
    }
}