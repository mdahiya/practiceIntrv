public class SynchronizedCounter {
    private volatile int c = 0;

    public synchronized void increment() {
        c++;
        System.out.println("Incremented value:\t"+c);
    }

    public synchronized void decrement() {
        c--;

        System.out.println("Dcremented value:\t"+c);
    }

    public synchronized int value() {
        return c;
    }
}
