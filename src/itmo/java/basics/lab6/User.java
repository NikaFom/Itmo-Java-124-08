package itmo.java.basics.lab6;

public class User extends ParentUser {
    @Override
    public void userInfo() {
        super.userInfo();
        System.out.println("Имя пользователя " + super.name);
    }
}
