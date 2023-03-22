

// Реализовать простой калькулятор

import java.util.Scanner;

public class HW_01_03 {
    public static void main(String[] args) {
        double number01;
        double number02;
        double answer;
        char operation;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        number01 = scanner.nextDouble();
        System.out.print("Enter 1st number: ");
        number02 = scanner.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        operation = scanner.next().charAt(0);
        switch (operation) {
            case '+':
                answer = number01 + number02;
                break;
            case '-':
                answer = number01 - number02;
                break;
            case '*':
                answer = number01 * number02;
                break;
            case '/':
                answer = number01 / number02;
                break;
            default:
                System.out.printf("Error! Enter correct operator");
                return;
        }
        System.out.print("\nThe answer is: ");
        System.out.printf(number01 + " " + operation + " " + number02 + " = " + answer);
        scanner.close();
    }
}
