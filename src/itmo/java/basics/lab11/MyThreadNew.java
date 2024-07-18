package itmo.java.basics.lab11;

public class MyThreadNew extends Thread{
    private Object lock;
    public MyThreadNew(Object object) {
        this.lock = object;
    }

    @Override
    public void run() { // создает два потока, каждый из которых выводит свое имя
        int i = 0;
        while (i < 3) {
            synchronized (lock) {
                try {
                    System.out.println(Thread.currentThread().getName());
                    lock.notify();
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
