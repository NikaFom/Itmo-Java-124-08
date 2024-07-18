package itmo.java.basics.lab11;

public class Main {
    public static void main(String[] args) { // задание 1 и 2
        MyThread myThread = new MyThread();
        System.out.println(myThread.getState());
        myThread.start();
        System.out.println(myThread.getState());


        Counter counter = new Counter(); // задание 3
        counter.run();
        counter.run();


        Object lock = new Object(); // задание 4
        MyThreadNew myThreadNew = new MyThreadNew(lock);
        myThreadNew.start();
        MyThreadNew myThreadNew2 = new MyThreadNew(lock);
        myThreadNew2.start();
    }
}
