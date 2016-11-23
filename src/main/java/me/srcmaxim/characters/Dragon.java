package me.srcmaxim.characters;

import me.srcmaxim.weapons.FireBreath;
import org.springframework.beans.factory.annotation.Autowired;

public class Dragon extends Character {

    FireBreath dragonFireBreath;

    public Dragon(String name, int strenghtPoints, int helthPoints, int armorPoints) {
        super(name, strenghtPoints, helthPoints, armorPoints);
    }

    public Dragon() {
    }

    public void move() {
        System.out.println("Dragon " + name + " flying");
    }

    protected int getAttackPoints() {
        return dragonFireBreath.getDamagePoints() * (strenghtPoints + 30);
    }

    public FireBreath getDragonFireBreath() {
        return dragonFireBreath;
    }

    @Autowired
    public void setDragonFireBreath(FireBreath dragonFireBreath) {
        this.dragonFireBreath = dragonFireBreath;
    }
}
