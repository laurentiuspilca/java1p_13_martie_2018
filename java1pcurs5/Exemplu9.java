import java.util.concurrent.*;

public class Exemplu9 {

    public static void main(String [] args) throws Exception {
        ForkJoinPool pool = new ForkJoinPool();
        FibonacciNumberTask task = new FibonacciNumberTask(6);
        
        Future<Integer> res = pool.submit(task);
        System.out.println(res.get());
    }
}