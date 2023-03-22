package Seminar02;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Seminar_02_04 {

    static String buildText(String text) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            builder.append(text);
        }
        return builder.toString();
    }

    public static void saveToFile(String nameFile, String s) {
        try (FileWriter fw = new FileWriter(nameFile, false)){
            fw.write(s);
            System.out.println(nameFile + ": data is saved");
            fw.flush();
            }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input string: ");
        String inputText = buildText(scanner.nextLine());
        System.out.println(inputText);

        saveToFile("MyText.txt", inputText);


        scanner.close();
    }
}
