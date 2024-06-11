package itmo.java.basics.lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] ints1 = new int[101]; // часть 1 задание 1
        for(int i = 0; i < ints1.length; i++) {
            if(i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }


        for(int i = 1; i < ints1.length; i++) { // часть 1 задание 2
            if(i % 3 == 0) {
                System.out.println("Делится на 3: " + i + " ");
            }
        }
        for(int i = 1; i < ints1.length; i++) {
            if(i % 5 == 0) {
                System.out.println("Делится на 5: " + i + " ");
            }
        }
        for(int i = 1; i < ints1.length; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("Делится на 3 и на 5: " + i + " ");
            }
        }


        Scanner scanner = new Scanner(System.in); // часть 1 задание 3
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();
        int sum = a + b;
        if(sum == c) {
            System.out.println("Результат: true");
        }


        System.out.print("Введите первое число: "); // часть 1 задание 4
        int d = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int e = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int f = scanner.nextInt();
        if(e > d && f > e) {
            System.out.println("Результат: true");
        }


        int[] ints2 = {3,-3,7,4,5,4,3}; // часть 1 задание 5
        System.out.println(Arrays.toString(ints2));
        checkFirstAndLast(ints2);
        System.out.println(checkFirstAndLast(ints2));


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


    private static String checkFirstAndLast(int[] ints2) { // проверить первый и последний элемент
        if(ints2[0] == 3 || ints2[ints2.length-1] == 3) {
        }
        String result = "true";
        return result;
    }


    private static void checkNumber(int[] ints3) { // проверить на наличие числа
        for(int i:ints3) {
            if (i == 1) {
                System.out.println("Массив содержит 1");
            }
            if (i == 3) {
                System.out.println("Массив содержит 3");
            }
        }
    }


    private static void checkSorting(int[] ints4) { // проверить сортировку по возрастанию
        int[] ints5 = new int[ints4.length];
        for(int i = 0; i < ints4.length; i++) {
            ints5[i] = ints4[i];
        }
        for(int i = 0; i < ints5.length; i++) {
            for (int j = 0; j < ints5.length; j++) {
                if (ints5[i] < ints5[j]) {
                    int aj = ints5[j];
                    int ai = ints5[i];
                    ints5[j] = ai;
                    ints5[i] = aj;
                }
            }
        }
        System.out.println(Arrays.toString(ints4));
        System.out.println(Arrays.toString(ints5));
        if(ints4 == ints5) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }


    private static int[] changeFirstAndLast(int[] ints7) { // поменять местами первый и последний элемент
        int first = ints7[0];
        int last = ints7[ints7.length-1];
        ints7[0] = last;
        ints7[ints7.length-1] = first;
        return ints7;
    }


    private static void findUniqueNumber(int[] ints8) { // найти уникальное число
        for(int i = 0; i < ints8.length; i++) {
            boolean flag = true;
            for(int j = 0; j < ints8.length; j++) {
                if(ints8[i] == ints8[j] && i != j) {
                    flag = false;
                    break;
                }
            }
            if(flag) System.out.println(ints8[i]);
        }
    }
}
