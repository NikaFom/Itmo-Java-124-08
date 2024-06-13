package itmo.java.basics.lab5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "Привет, меня зовут Маша Иванова. Я живу в Москве."; // задание 1
        theLongestWord(text);
        System.out.println(theLongestWord(text));


        String word = "Топот "; // задание 2
        isPalindrom(word);
        System.out.println(isPalindrom(word));


        String text2 = "Это бяка. Многие люди часто бякают. Это плохо."; // задание 3
        String word1 = "бяка";
        String word2 = "[вырезано цензурой]";
        replaceWord(text2, word1, word2);
        System.out.println(replaceWord(text2, word1, word2));


        String string1 = "караван автомобилей завтра отправляется"; // задание 4
        String string2 = string1.substring(3, 5);
        countSubstring(string1, string2);
        System.out.println(countSubstring(string1, string2));


        String string3 = "This is a test string"; // задание 5
        invertString(string3);
        System.out.println("The given string is: " + string3);
        System.out.print("The string reversed word by word is: " + '\n' + invertString(string3));
    }


    private static String theLongestWord(String text) { // найти самое длинное слово в тексте
        String max = "";
        String[] strings = text.split(" ");
        for(String string:strings) {
            string = string.replaceAll("\\pP", "");
            if(string.length() > max.length()) {
                max = string;
            }
        }
        return max;
    }


    private static boolean isPalindrom(String word) { // проверить, является ли слово палиндромом
        word = word.trim();
        word = word.toLowerCase();
        StringBuilder builder1 = new StringBuilder(word);
        builder1.reverse();
        boolean result = word.equals(builder1.toString());
        return result;
    }


    private static String replaceWord(String text, String word1, String word2) { // заменить слово "бяка"
        text = text.replace(word1, word2);
        return text;
    }


    private static int countSubstring(String string1, String string2) { // посчитать количество вхождений подстроки в строку
        Pattern pattern = Pattern.compile(string2);
        Matcher matcher = pattern.matcher(string1);
        int count = 0;
        while(matcher.find()) {
            count++;
        }
        return count;
    }


    private static String invertString(String string) { // инвертировать слова в строке
        String result = "";
        String[] words = string.split(" ");
        for(String word:words) {
            StringBuilder builder = new StringBuilder(word);
            builder.reverse();
            word = builder.toString();
            result = result + word + " ";
        }
        return result;
    }
}
