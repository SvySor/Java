package com.epam.knight.model;

import com.epam.knight.model.ammunition.Ammunition;
import com.epam.knight.model.ammunition.AmmunitionType;

/**
 * Manipulates with knight's ammunition and updates knight stats.
 */
public class KnightAmmunitionManager {
    private Knight knight;

    public KnightAmmunitionManager(Knight knight) {
        this.knight = knight;
    }

    /**
     * Equips item to knight and update knight's stats
     */
    public void equipAmmunitionToKnight(Ammunition item) {
        knight.equip(item);
        knight.setWeight(calculateAmmunitionWeight());
        knight.setCost(calculateAmmunitionCost());
        knight.setDamage(calculateAmmunitionDamage());
        knight.setProtection(calculateAmmunitionProtection());
    }

    public int calculateAmmunitionWeight() {
        Integer newWeight = 0;
        for (int i = 0; i < knight.getAmmunition().length; i++) {
            newWeight += knight.getAmmunition()[i].getWeight();
        }
        return newWeight;
    }

    public int calculateAmmunitionCost() {
        Integer newCost = 0;
        for (int i = 0; i < knight.getAmmunition().length; i++) {
            newCost += knight.getAmmunition()[i].getCost();
        }
        return newCost;
    }

    public int calculateAmmunitionDamage() {
        Integer newDamage = 0;
        for (int i = 0; i < knight.getAmmunition().length; i++) {
            if (knight.getAmmunition()[i].getAmmunitionType() == AmmunitionType.WEAPON) {
                newDamage += knight.getAmmunition()[i].getDamage();
            }
        }
        return newDamage;
    }

    public int calculateAmmunitionProtection() {
        Integer newProtection = 0;
        for (int i = 0; i < knight.getAmmunition().length; i++) {
            if (knight.getAmmunition()[i].getAmmunitionType() == AmmunitionType.PROTECT) {
                newProtection += knight.getAmmunition()[i].getProtection();
            }
        }
        return newProtection;
    }

    public void sortAmmunition(){
        return knight.getAmmunition().Compara
    }
}
