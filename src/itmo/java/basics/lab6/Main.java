package itmo.java.basics.lab6;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        Human client = new Client("Bred", "Pitt", "VTB"); // задание 1
        client.info();
        Human bankEmployee = new BankEmployee("Johnny", "Depp", "Sberbank");
        bankEmployee.info();

        printLanguage((Speakable) client); // задание 2
        printLanguage((Speakable) bankEmployee);


        Car truck = new Truck(2000, "Man", 'b', 150.0f, 12, 2500); // задание 3
        ((Truck) truck).newWheels(14);


        Scanner scanner = new Scanner(System.in); // задание 4
        int a = scanner.nextInt();
        Main child = new Child();
        ((Child) child).printInt(a);


        ParentUser user = new User(); // задание 5
        user.userInfo();
    }


    public static void printLanguage(Speakable language) {
        language.printLanguage();
    }
}
