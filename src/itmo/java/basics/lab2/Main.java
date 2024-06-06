package itmo.java.basics.lab2;
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sum(323902930L, 489248923L);
        calculator.sum(20.94, 54.1);
        calculator.division(48, 8);
        calculator.division(25, 5);
        calculator.multiplication(0.1, 0.2);
        calculator.subtraction(40594L, 30854L);

        Phone phone = new Phone("iPhone", "15", "Black", 190000L, 512);
        System.out.println(phone);

        phone.setModel("14");
        phone.setColour("White");
        phone.setMemory(256);
        phone.setPrice(165000L);
        System.out.println(phone);
    }
}