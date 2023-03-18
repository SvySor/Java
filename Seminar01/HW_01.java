package Seminar01;

import java.util.Scanner;

// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)


public class HW_01 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.printf("Inputed value: %d", value);
        System.out.print("\n");
        int Summa = 0;
        int Factorial = 1;
        for (int i = 0; i <= value; i++) {
            Summa = Summa + i;
            }
        if (value > 1) {
            for (int i = 1; i <= value; i++) {
                Factorial = Factorial * i;
                }
            }
        System.out.printf("Triangle value is: %d", Summa);
        System.out.print("\n");
        System.out.printf("Factorial of value is: %d", Factorial);
        scanner.close();
    }
}
