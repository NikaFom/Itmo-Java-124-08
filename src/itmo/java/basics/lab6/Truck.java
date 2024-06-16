package itmo.java.basics.lab6;

public class Truck extends Car {
    public int wheels;
    public int maxWeight;

    public void newWheels(int newWheels) {
        wheels = newWheels;
        System.out.println("Количество колес: " + wheels);
    }

    public Truck(int w, String m, char c, float s, int wheels, int maxWeight) {
        super(w, m, c, s);
        this.wheels = wheels;
        this.maxWeight = maxWeight;

    }
}
