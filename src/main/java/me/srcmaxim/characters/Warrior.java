package me.srcmaxim.characters;

import me.srcmaxim.weapons.Sword;
import org.springframework.beans.factory.annotation.Autowired;

public class Warrior extends Character {

    Sword warriorSword;

    public Warrior(String name, int strenghtPoints, int helthPoints, int armorPoints, Sword warriorSword) {
        super(name, strenghtPoints, helthPoints, armorPoints);
        this.warriorSword = warriorSword;
    }

    public Warrior() {
    }

    public void move() {
        System.out.println("Warrior " + name + " moving");
    }

    protected int getAttackPoints() {
        return (warriorSword.getDamagePoints() + 10) * strenghtPoints;
    }


    public Sword getWarriorSword() {
        return warriorSword;
    }

    @Autowired
    public void setWarriorSword(Sword warriorSword) {
        this.warriorSword = warriorSword;
    }
}
