import java.util.concurrent.locks.*;

public class Exemplu13 {

    private ReadWriteLock lock = new ReentrantReadWriteLock();
    private int x;
    
    public void increment() {
        try {
            lock.writeLock().lock();
            x++;
        } finally {
            lock.writeLock().unlock();
        }
    }
    
    public int get() {
        try {
            lock.readLock().lock();
            return x;
        } finally {
            lock.readLock().unlock();
        }
    }
}