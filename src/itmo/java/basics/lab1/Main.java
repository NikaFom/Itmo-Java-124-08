package itmo.java.basics.lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Я"); // Задание 1
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");


        System.out.println(""); // Задание 3
        double res = getNumber3();
        showResult(res);


        Scanner scanner = new Scanner(System.in); // Задание 5
        int num1 = scanner.nextInt();
        System.out.println(num1);

        int num2 = scanner.nextInt();
        System.out.println(num2);

        int num3 = scanner.nextInt();
        System.out.println(num3);


        int b = scanner.nextInt(); // Задание 6
        if (b % 2 != 0) {
            System.out.println("Нечетное");
        } else if (b % 2 == 0 && b <= 100) {
            System.out.println("Четное");
        } else if (b % 2 == 0 && b > 100) {
            System.out.println("Выход за пределы диапазона");
        }
    }

    public static double getNumber1() { // Задание 2, первое выражение
        double a;
        a = (46 + 10) * ((double) 10 / 3);
        return a;
    }
    public static int getNumber2() { // Задание 2, второе выражение
        int b;
        b = (29) * (4) * (-15);
        return b;
    }

    public static double getNumber3() { // Задание 3, функция
        double number = (double) 10500;
        double result = (double) (number / 10) / 10;
        return result;
    }
    public static void showResult(double number) { // Задание 3, процедура вывода на экран
        System.out.println(number);
    }

    public static double getNumber4() { // Задание 4
        double a = 3.6;
        double b = 4.1;
        double c = 5.9;
        double result = a * b * c;
        return result;
    }
}