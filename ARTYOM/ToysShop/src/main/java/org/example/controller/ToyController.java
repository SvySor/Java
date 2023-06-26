package org.example.controller;

import org.example.model.FileToysManager;
import org.example.model.Toy;
import org.example.model.ToysManager;
import org.example.view.MainView;

public class ToyController {

    private ToysManager toysManager;
    private MainView mainView;

    private FileToysManager fileToysManager;

    public ToyController() {
        toysManager = new ToysManager();
        mainView = new MainView();
        fileToysManager = new FileToysManager();
    }

    public void startLotery(){
//        Toy toy1 = new Toy(1, "Toy1", 20, 15);
//        Toy toy2 = new Toy(2, "Toy2", 17, 90);
//        Toy toy3 = new Toy(3, "Toy3", 10, 100);
//        toysManager.addToy(toy1);
//        toysManager.addToy(toy2);
//        toysManager.addToy(toy3);
        toysManager.addToys(fileToysManager.getToysFromFile());
        boolean gameStatus = mainView.mainMenu(toysManager.getToyList());
        while (gameStatus){
            Toy win = toysManager.lotteryStep();
            mainView.printToys(toysManager.getToyList());
            if (win != null){
                boolean flagNewLotery = mainView.winMenu(win);
                if (!flagNewLotery) {
                    break;
                }
            }
            else{
                mainView.endToys();
                break;
            }
        }
        mainView.endLotery();
    }
}
