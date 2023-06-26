package org.example.view;

import org.example.model.Toy;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class MainView {

    private Scanner scanner = new Scanner(System.in);

    public boolean mainMenu(List<Toy> toys){
        System.out.println("МАГАЗИН ИГРУШЕК");
        System.out.println("Наши игрушки:");
        printToys(toys);
        System.out.println("Будете играть в лотерею? (Y/N)");
        String answer = scanner.nextLine();
        if (answer.equals("Y")) {
            return true;
        }
        else {
            return false;
        }
    }

    public void endToys(){
        System.out.println("Извините, игрушки закончились");
    }

    public void endLotery(){
        System.out.println("Лотерея закончилась");
    }


    public boolean winMenu(Toy toy){
        System.out.println("Поздравляем, вы выиграли игрушку:");
        System.out.println(toy.getName());
        System.out.println("Будете играть ещё? (Y/N)");
        String answer = scanner.nextLine();
        if (answer.equals("Y")) {
            return true;
        }
        else {
            return false;
        }
    }

    public void printToys(List<Toy> toys){
        for (Toy item: toys) {
            System.out.println("Name: " + item.getName() + " Quantity: " + item.getQuantity());
        }
    }
}
