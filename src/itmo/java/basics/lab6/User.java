package itmo.java.basics.lab6;

public class User extends Main{
    public String name;

    public User(String name) {
        this.name = name;
    }

    public void userInfo() {
        System.out.println("Имя пользователя " + name);
    }

}
