package itmo.java.basics.lab3;

public class House {
    private Integer numberOfFloors;
    private Integer yearOfBuilding;
    private String name;

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public Integer getYearOfBuilding() {
        return yearOfBuilding;
    }

    public void setYearOfBuilding(Integer yearOfBuilding) {
        this.yearOfBuilding = yearOfBuilding;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "House{" +
                "numberOfFloors=" + numberOfFloors +
                ", yearOfBuilding=" + yearOfBuilding +
                ", name='" + name + '\'';
    }

    public int numberOfYears() {
        int thisYear = 2024;
        int years = thisYear - yearOfBuilding;
        return years;
    }
}
