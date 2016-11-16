package me.srcmaxim.characters;

import me.srcmaxim.weapons.Weapon;

public class Dragon extends Character {

    public Dragon(String name, Weapon weapon, int strenghtPoints, int helthPoints, int armorPoints) {
        super(name, weapon, strenghtPoints, helthPoints, armorPoints);
    }

    public Dragon(String name, Weapon weapon) {
        super(name, weapon);
    }

    public Dragon() {
    }

    public void move() {
        System.out.println("Dragon " + name + " flying");
    }

    protected int getAttackPoints() {
        return weapon.getDamagePoints() * (strenghtPoints + 30);
    }

}
