package me.srcmaxim.characters;

import me.srcmaxim.weapons.FireBreath;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Dragon extends Character {

    FireBreath concreteFireBreath;

    public Dragon(String name, int strenghtPoints, int helthPoints, int armorPoints) {
        super(name, strenghtPoints, helthPoints, armorPoints);
    }

    public Dragon() {
    }

    public void move() {
        System.out.println("Dragon " + name + " flying");
    }

    protected int getAttackPoints() {
        return concreteFireBreath.getDamagePoints() * (strenghtPoints + 30);
    }

    public FireBreath getConcreteFireBreath() {
        return concreteFireBreath;
    }

    @Resource(name = "fireBreath")
    public void setConcreteFireBreath(FireBreath concreteFireBreath) {
        this.concreteFireBreath = concreteFireBreath;
    }

    @PostConstruct
    public void initializeDragon() {
        System.out.println("PostConstruct: Init of Dargon");
    }

    @PreDestroy
    public void destroyDragon() {
        System.out.println("PreDestroy: Destroy of Dragon");
    }
}
