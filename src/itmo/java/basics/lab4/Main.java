package itmo.java.basics.lab4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        oddNumbers(); // часть 1 задание 1


        divideByThree(); // часть 1 задание 2
        divideByFive();
        divideByThreeAndFive();


        Scanner scanner = new Scanner(System.in); // часть 1 задание 3
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();
        checkSum(a, b, c);


        System.out.print("Введите первое число: "); // часть 1 задание 4
        int d = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int e = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int f = scanner.nextInt();
        compareNumbers(d, e, f);


        int[] ints2 = {3,-3,7,4,5,4,3}; // часть 1 задание 5
        System.out.println(Arrays.toString(ints2));
        checkFirstAndLast(ints2);


        int[] ints3 = {5,2,8,4,1,9,0,3}; // часть 1 задание 6
        checkNumber(ints3);


        int[] ints4 = new int[]{4,7,2,6}; // часть 2 задание 1
        checkSorting(ints4);


        System.out.println("Array length: "); // часть 2 задание 2
        int length = scanner.nextInt();
        int[] ints6 = new int[length];
        System.out.println("Numbers of array:");
        for(int i = 0; i < length; i++) {
            int j = scanner.nextInt();
            ints6[i] = j;
        }
        System.out.println("Result: " + Arrays.toString(ints6));


        int[] ints7 = new int[]{5,6,7,2}; // часть 2 задание 3
        System.out.println("Array 1: " + Arrays.toString(ints7));
        changeFirstAndLast(ints7);
        System.out.println("Array 2: " + Arrays.toString(ints7));


        int[] ints8 = new int[]{1,2,3,1,2,4}; // часть 2 задание 4
        findUniqueNumber(ints8);
    }


    private static void oddNumbers() { // вывести нечетные числа
        int oddNumber;
        for(int i = 1; i <= 99; i++) {
            if(i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }


    private static void divideByThree() { // разделить на 3
        for(int i = 1; i <= 100; i++) {
            if(i % 3 == 0) {
                System.out.println("Делится на 3: " + i + " ");
            }
        }
    }


    private static void divideByFive() { // разделить на 5
        for(int i = 1; i <= 100; i++) {
            if(i % 5 == 0) {
                System.out.println("Делится на 5: " + i + " ");
            }
        }
    }


    private static void divideByThreeAndFive() { // разделить на 3 и 5
        for(int i = 1; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("Делится на 3 и на 5: " + i + " ");
            }
        }
    }


    private static boolean checkSum(int a, int b, int c) { // вычислить сумму двух целых чисел
        int sum = a + b;
        if(sum == c) {
            System.out.println("Результат: true");
        }
        return true;
    }


    private static boolean compareNumbers(int d, int e, int f) { // сравнить три целых числа
        if(e > d && f > e) {
            System.out.println("Результат: true");
        }
        return true;
    }


    private static boolean checkFirstAndLast(int[] ints) { // проверить первый и последний элемент
        if(ints[0] == 3 || ints[ints.length-1] == 3) {
            System.out.println("true");
        }
        return true;
    }


    private static boolean checkNumber(int[] ints) { // проверить на наличие числа
        for(int i:ints) {
            if (i == 1 || i == 3) {
                System.out.println("Массив содержит 1 или 3");
            }
        }
        return true;
    }


    private static int[] checkSorting(int[] ints) { // проверить сортировку по возрастанию
        int[] ints2 = new int[ints.length];
        for(int i = 0; i < ints.length; i++) {
            ints2[i] = ints[i];
        }
        for(int i = 0; i < ints2.length; i++) {
            for (int j = 0; j < ints2.length; j++) {
                if (ints2[i] < ints2[j]) {
                    int aj = ints2[j];
                    int ai = ints2[i];
                    ints2[j] = ai;
                    ints2[i] = aj;
                }
            }
        }
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(ints2));
        if(ints == ints2) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
        return ints;
    }


    private static int[] changeFirstAndLast(int[] ints) { // поменять местами первый и последний элемент
        int first = ints[0];
        int last = ints[ints.length-1];
        ints[0] = last;
        ints[ints.length-1] = first;
        return ints;
    }


    private static int[] findUniqueNumber(int[] ints) { // найти уникальное число
        for(int i = 0; i < ints.length; i++) {
            boolean flag = true;
            for(int j = 0; j < ints.length; j++) {
                if(ints[i] == ints[j] && i != j) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.println(ints[i]);
            }
        }
        return ints;
    }
}
