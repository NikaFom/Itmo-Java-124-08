package itmo.java.basics.lab9;

import itmo.java.basics.lab3.Car;
import itmo.java.basics.lab7.Plane;

import java.util.*;

import static java.lang.System.currentTimeMillis;

public class Main {
    public static void main(String[] args) {
        List<Object> list1 = new ArrayList<>(); // задание 2
        list1.add(new Car().toString());
        list1.add(new Plane().toString());
        list1.add(new Car().toString());
        System.out.println(list1);
        System.out.println(uniqueList(list1));

        List<Integer> list2 = new ArrayList<>();  // задание 3
        List<Integer> list3 = new LinkedList<>();
        addElements(list2, 1000000);
        System.out.println(list2.size());
        addElements(list3, 1000000);
        System.out.println(list3.size());

        long startList2 = currentTimeMillis(); // задание 3, замерить время
        getRandomElement(list2, 100000);
        long finishList2 = currentTimeMillis();
        System.out.println("Время, потраченное на получение рандомных элементов: " + (finishList2 - startList2));
        long startList3 = currentTimeMillis();
        getRandomElement(list3, 100000);
        long finishList3 = currentTimeMillis();
        System.out.println("Время, потраченное на получение рандомных элементов: " + (finishList3 - startList3));

        Map<String, Integer> game = new HashMap<>(); // задание 4
        User user1 = new User("Tom");
        User user2 = new User("Hugo");
        User user3 = new User("Angelina");
        User user4 = new User("Ben");
        game.put(user1.getName(), 26);
        game.put(user2.getName(), 31);
        game.put(user3.getName(), 17);
        game.put(user4.getName(), 10);
        getScores(game);
    }

    public static Set<Object> uniqueList(List<Object> list) { // получить коллекцию без дубликатов
        Set<Object> uniqueSet = new HashSet<>(list);
        return uniqueSet;
    }

    public static List addElements(List list, int amountOfElements) { // добавить определенное кол-во элементов
        for(int i = 0; i < amountOfElements; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static void getRandomElement(List list, int times) { // выбрать элемент наугад определенное кол-во раз
        for(int i = 0; i < times; i++) {
            list.get((int) (Math.random() * (list.size() - 1)));
        }
    }

    public static void getScores(Map map) { // считать имя с консоли и вывести на экран очки
        Set<String> users = map.keySet();
        System.out.println(users);
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if(users.contains(name)) {
            Integer score = (Integer) map.get(name);
            System.out.println(score);
        } else {
            System.out.println("Игрока с таким именем не существует");
        }
    }
}
