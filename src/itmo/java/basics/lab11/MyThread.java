package itmo.java.basics.lab11;

public class MyThread extends Thread{
    private Object lock = new Object();

    public void run() { // запускает 10 потоков, каждый из которых выводит числа от 0 до 100
        for (int i = 0; i < 10; i++) {
            new MyThread().start();
            int number = 0;
            while (number <= 100) {
                System.out.println(Thread.currentThread().getName() + " " + number);
                number++;
            }
            number = 0;
        }
    }
}
