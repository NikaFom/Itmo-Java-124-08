package itmo.java.basics.lab11;

public class CounterThread extends Thread {
    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    public Counter getCounter() {
        return counter;
    }

    public void run() {
        synchronized (getCounter()) {
            for (int j = 0; j < 1000; j++) {
                counter.increment();
            }
        }
        System.out.println(getCounter().getCount());
    }
    public void countThread() { // запускает 100 потоков, каждый из которых вызывает метод 1000 раз
        for(int i = 0; i < 100; i++) {
            new CounterThread(counter).start();
        }
    }
}
