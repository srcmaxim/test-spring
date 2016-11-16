package me.srcmaxim.characters;

import me.srcmaxim.weapons.Weapon;

public class Warrior extends Character {

    public Warrior(String name, Weapon weapon, int strenghtPoints, int helthPoints, int armorPoints) {
        super(name, weapon, strenghtPoints, helthPoints, armorPoints);
    }

    public Warrior() {
    }

    public void move() {
        System.out.println("Warrior " + name + " moving");
    }

    protected int getAttackPoints() {
        return (weapon.getDamagePoints() + 10) * strenghtPoints;
    }


}
