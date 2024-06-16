package itmo.java.basics.lab6;
import java.util.Scanner;
public class ParentUser {
    Scanner scanner = new Scanner(System.in);
    int age = scanner.nextInt();
    String name = scanner.next();

    public void userInfo() {
        System.out.println("Возраст пользователя: " + age);
    }

}
