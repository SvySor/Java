package org.example.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToysManager {

    private List<Toy> toyList = new ArrayList<>();

    public void addToy(Toy toy) {
        toyList.add(toy);
    }

    public void addToys(List<Toy> toys) {
        toyList.addAll(toys);
    }

    public void changeToyWeight(Toy toy){
        for (int i = 0; i < toyList.size(); i++) {
            if (toy.equals(toyList.get(i))) {
                toyList.set(i, toy);
                break;
            }
        }
    }

    public List<Toy> getToyList() {
        return toyList;
    }

    public Toy lotteryStep() {
        if (checkToysStock()) {
            int znamenatel = 0;
            int chislitel[] = new int[toyList.size()];
            for (int i = 0; i < chislitel.length; i++) {
                int veroyatnost = toyList.get(i).getQuantity() * toyList.get(i).getFrequency();
                if (i == 0) {
                    chislitel[i] = veroyatnost;
                } else {
                    chislitel[i] = chislitel[i - 1] + veroyatnost;
                }
                znamenatel += veroyatnost;
            }
            Random random = new Random();
            int vinIndex = 0;
            int vinNumber = random.nextInt(znamenatel + 1);
            for (int i = 0; i < chislitel.length; i++) {
                if (vinNumber <= chislitel[i]) {
                    vinIndex = i;
                    break;
                }
            }
            Toy vinToy = toyList.get(vinIndex);
            vinToy.setQuantity(vinToy.getQuantity() - 1);
            if (vinToy.getQuantity() == 0) {
                toyList.remove(vinToy);
            }
            return vinToy;
        }
        return null;
    }

    private boolean checkToysStock(){
        return !toyList.isEmpty();
    }
}
