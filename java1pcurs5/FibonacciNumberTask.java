import java.util.concurrent.*;

public class FibonacciNumberTask extends RecursiveTask<Integer> {
    
    private int k;
    
    public FibonacciNumberTask(int k) {
        this.k = k;
    }
    
    @Override
    public Integer compute() {
        if (k <= 1) return 1;
        
        FibonacciNumberTask t1 = new FibonacciNumberTask(k - 1);
        FibonacciNumberTask t2 = new FibonacciNumberTask(k - 2);
        
        t2.fork();
        
        return t1.compute() + t2.join();
    }
}