package itmo.java.basics.lab11;

public class MyThreadNew extends Thread{
    private Object lock = new Object();
    @Override
    public void run() {
        new MyThreadNew().start();
        int i = 0;
        synchronized (lock) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            while (i < 3) {
                System.out.println(Thread.currentThread().getName());
            }
        }

        synchronized (this) {
            notify();
        }
    }
}
