public class Numar {

    private int x;
    
    public void increment() {
        this.x++;
    }
    
    public int get() {
        return x;
    }
    
    public synchronized int incrementAndGet() {
        increment();
        return get();
    }
}