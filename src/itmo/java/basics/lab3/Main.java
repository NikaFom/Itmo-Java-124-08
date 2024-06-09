package itmo.java.basics.lab3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setColour("White");
        car1.setMake("Toyota");
        car1.setWeight("2500 kg");

        Car car2 = new Car();
        car2.setColour("Red");
        car2.setMake("BMW");
        car2.setWeight("3000 kg");

        System.out.println(car1);
        System.out.println(car2);



        House house1 = new House();
        house1.setNumberOfFloors(9);
        house1.setYearOfBuilding(2000);
        house1.setName("Old");
        int yearsHouse1 = house1.numberOfYears();

        House house2 = new House();
        house2.setNumberOfFloors(30);
        house2.setYearOfBuilding(2022);
        house2.setName("Modern");
        int yearsHouse2 = house2.numberOfYears();

        System.out.println(house1 + ", " +yearsHouse1 + " years}");
        System.out.println(house2 + ", " +yearsHouse2 + " years}");


        Tree tree1 = new Tree(24, "Dub");
        tree1.setAge(24);
        tree1.setName("Dub");
        System.out.println(tree1);

        Tree tree2 = new Tree(9, true, "Bereza");
        tree2.setAge(9);
        tree2.setAlive(true);
        tree2.setName("Bereza");
        System.out.println(tree2);

        Tree tree3 = new Tree();
    }
}
