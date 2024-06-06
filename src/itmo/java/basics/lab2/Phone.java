package itmo.java.basics.lab2;

public class Phone {
    private String make;
    private String model;
    private String colour;
    private Long price;
    private Integer memory;

    public Phone() {
    }

    public Phone(String make, String model, String colour, Long price, Integer memory) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.price = price;
        this.memory = memory;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                ", memory=" + memory +
                '}';
    }
}
