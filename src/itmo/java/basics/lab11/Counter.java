package itmo.java.basics.lab11;

public class Counter {
    static int count = 0;

    public static void increment() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }

    public void run() { // запускает 100 потоков, каждый из которых вызывает метод 1000 раз
        for(int i = 0; i < 100; i++) {
            new MyThread().start();
            int j = 0;
            while (j < 1000) {
                Counter.increment();
                j++;
            }
            j = 0;
            System.out.println(count);
        }
    }
}
