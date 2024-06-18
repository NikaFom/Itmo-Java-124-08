package itmo.java.basics.lab7;

public class Plane {
    class Wing {
        private Integer wingWeight;

        void printWingWeight() {
            System.out.println("Вес крыла самолета - " + wingWeight);
        }
    }

    public void innerMethodCall() {
        Wing wing1 = new Wing();
        wing1.wingWeight = 500;
        wing1.printWingWeight();

        Wing wing2 = new Wing();
        wing2.wingWeight = 1000;
        wing2.printWingWeight();

        Wing wing3 = new Wing();
        wing3.wingWeight = 2000;
        wing3.printWingWeight();
    }
}
