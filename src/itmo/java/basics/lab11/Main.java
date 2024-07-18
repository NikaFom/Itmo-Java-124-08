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

        MyThreadNew myThreadNew = new MyThreadNew(); // задание 4
        myThreadNew.start();
    }


}
