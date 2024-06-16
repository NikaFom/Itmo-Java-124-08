package itmo.java.basics.lab6;
import java.util.Scanner;
public class ParentUser {
    protected Scanner scanner = new Scanner(System.in);
    protected int age = scanner.nextInt();
    protected String name = scanner.next();

    public void userInfo() {
        System.out.println("Возраст пользователя: " + age);
    }

}
