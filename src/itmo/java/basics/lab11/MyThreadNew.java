package itmo.java.basics.lab11;

public class MyThreadNew extends Thread{
    private Object lock = new Object();
    @Override
    public void run() { // создает два потока, каждый из которых выводит свое имя
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
                notify();
            }
        }

        synchronized (this) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            while (i > 3) {
                System.out.println(Thread.currentThread().getName());
                i++;
                notify();
            }
        }
    }
}
