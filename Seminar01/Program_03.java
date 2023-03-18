package Seminar01;

import java.util.Scanner;

/**
* Program
*/

public class Program_03 {
    private static int readInt(Scanner scanner, String message) {
        System.out.print(message);
        int value = scanner.nextInt();
        return value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int value = readInt(scanner, "Enter a number: ");
        System.out.printf("Inputed value: %d", value);
        scanner.close();
    }
}