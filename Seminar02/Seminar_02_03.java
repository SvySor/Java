package Seminar02;

// Проверка на полиндром

import java.util.Scanner;

public class Seminar_02_03 {
    static boolean Polyndrom(String str) {
        int len = str.length();
        for (int i = 0; i < len/2; i++){
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input string: ");
        String inputText = scanner.nextLine();
        if (Polyndrom(inputText)) {
            System.out.println("String is polindrome");
        } else {
            System.out.println("String is not a polindrome");
        }
        scanner.close();
    }
}
