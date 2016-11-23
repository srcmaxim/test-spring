package me.srcmaxim.characters;

import me.srcmaxim.weapons.Sword;

import javax.annotation.Resource;

public class Warrior extends Character {

    Sword concreteSword;

    public Warrior(String name, int strenghtPoints, int helthPoints, int armorPoints) {
        super(name, strenghtPoints, helthPoints, armorPoints);
    }

    public Warrior() {
    }

    public void move() {
        System.out.println("Warrior " + name + " moving");
    }

    protected int getAttackPoints() {
        return (concreteSword.getDamagePoints() + 10) * strenghtPoints;
    }


    public Sword getConcreteSword() {
        return concreteSword;
    }

    @Resource
    public void setConcreteSword( Sword concreteSword) {
        this.concreteSword = concreteSword;
    }
}
