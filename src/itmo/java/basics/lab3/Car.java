package itmo.java.basics.lab3;

public class Car {
    private String colour;
    private String make;
    private String weight;

    public String getColour(String red) {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", make='" + make + '\'' +
                ", weight=" + weight +
                '}';
    }

    public Car(String colour) {
        this.colour = colour;
    }

    public Car(String colour, String weight) {
        this.colour = colour;
        this.weight = weight;
    }

    public Car() {
    }
}
