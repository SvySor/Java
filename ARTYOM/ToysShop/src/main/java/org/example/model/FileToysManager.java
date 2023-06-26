package org.example.model;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileToysManager {

    private Scanner scanner;

    {
        try {
            File address = new File("toysstock.txt");
            scanner = new Scanner(address);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Toy> getToysFromFile(){
        List<Toy> toyList = new ArrayList<>();
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            String[] toyInfo = line.split(" ");
            int id = Integer.parseInt(toyInfo[0]);
            String name = toyInfo[1];
            int quantity = Integer.parseInt(toyInfo[2]);
            int frequency = Integer.parseInt(toyInfo[3]);
            Toy toy = new Toy(id, name, quantity, frequency);
            toyList.add(toy);
        }
        return toyList;
    }
}

