package com.epam.knight.model.ammunition;

public interface Ammunition {

    int getWeight();

    int getCost();

    default int getDamage(){
        return 0;
    }

    default int getProtection(){
        return 0;
    }

    AmmunitionType getAmmunitionType();
}
