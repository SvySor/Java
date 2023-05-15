package com.epam.knight.model;

import com.epam.knight.model.ammunition.Ammunition;

/**
 * Stores equipped ammunition and calculated stats.
 */
public class Knight {
    private static final Integer INIT_COST = 0;
    private static final Integer INIT_WEIGHT = 0;
    private static final Integer INIT_DAMAGE = 0;
    private static final Integer INIT_PROTECTION = 0;
    private static final Integer INIT_SIZE_AMUNITION = 0;


    private Ammunition[] ammunition;
    // TODO add fields for knight stats
    private Integer cost;
    private Integer weight;
    private Integer damage;
    private Integer protection;

    public Knight() {
        this.ammunition = new Ammunition[INIT_SIZE_AMUNITION];
        this.cost = INIT_COST;
        this.weight = INIT_WEIGHT;
        this.damage = INIT_DAMAGE;
        this.protection = INIT_PROTECTION;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getProtection() {
        return protection;
    }

    public void setProtection(Integer protection) {
        this.protection = protection;
    }

    public Ammunition[] getAmmunition() {
        return ammunition;
    }

    public void equip(Ammunition element) {
        ammunition = Arrays.copyOf(ammunition, ammunition.length + 1);
        ammunition[ammunition.length - 1] = element;
    }
}
