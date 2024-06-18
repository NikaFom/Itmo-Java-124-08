package itmo.java.basics.lab7;

public class Main {
    public static void main(String[] args) {
        Plane.Wing wing1 = new Plane.Wing();
        wing1.printWingWeight(500);

        Plane.Wing wing2 = new Plane.Wing();
        wing2.printWingWeight(1000);

        Plane.Wing wing3 = new Plane.Wing();
        wing3.printWingWeight(2000);
    }
}
