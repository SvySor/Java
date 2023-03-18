package Seminar01;

import java.util.Scanner;

/**
* Написать программу, которая вводит имя в консоли
Получает введённую строку и выведет в колнсоль сообщение "Привет, Имя!"
*/

public class Program_02 {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String your_name = scanner.next();
        System.out.printf("Hi, %s !", your_name);
        scanner.close();
    }
   }
