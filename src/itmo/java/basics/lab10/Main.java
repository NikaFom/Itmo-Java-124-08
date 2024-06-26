package itmo.java.basics.lab10;

import java.io.*;

public class Main {
    public static void main(String[] args) { // задание 1
        File file1 = new File("files/text.txt");
        readToString("files/text.txt");

        File file2 = new File("files/text2.txt"); // задание 2
        addText("files/text2.txt", "Java programming");

        File file3 = new File("files/text3.txt"); // задание 3
        File file4 = new File("files/text4.txt");
        combineTwoFiles("files/text3.txt", "files/text4.txt");

        File file5 = new File("files/text5.txt"); // задание 4
        replaceSymbols(file5);
    }

    public static void readToString(String path) { // вернуть файл в виде строк
        try(BufferedReader scanText= new BufferedReader(new FileReader(path))){
            for (String string; (string = scanText.readLine()) != null; ) {
                System.out.println(string);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void addText(String path, String text) { // записать в файл переданную строку
        try {
            FileWriter writer = new FileWriter(path, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(" " + text);
            bufferedWriter.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void combineTwoFiles(String path1, String path2) { // склеить два файла в один
        String text = null;
        try(BufferedReader reader = new BufferedReader(new FileReader(path2));
            BufferedWriter bufferWriter = new BufferedWriter(new FileWriter(path1, true));) {
            for (String string; (string = reader.readLine()) != null; ) {
                bufferWriter.newLine();
                bufferWriter.write(string);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void replaceSymbols(File file) { // заменить все, кроме букв и цифр
        try(BufferedReader scanText= new BufferedReader(new FileReader(file))){
            StringBuilder text = new StringBuilder(" ");
            for (String string; (string = scanText.readLine()) != null; ) {
                text.append(string).append('\n');
            }
            String string = text.toString().replaceAll("\\pP", "$");
            PrintWriter writer = new PrintWriter(file);
            writer.append(string);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}

