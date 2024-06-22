package itmo.java.basics.lab9;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void getScores(Map map) {
        Set<String> users = map.keySet();
        //System.out.println(users);
        //Collection<Integer> values = map.values();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Integer score = (Integer) map.get(name);
        System.out.println(score);
    }
}
