package me.srcmaxim.characters;

import me.srcmaxim.weapons.FireBreath;
import me.srcmaxim.weapons.Weapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Dragon extends Character {

    FireBreath concreteFireBreath;
    MessageSource messageSource;

    public Dragon(String name, int strenghtPoints, int helthPoints, int armorPoints) {
        super(name, strenghtPoints, helthPoints, armorPoints);
    }

    public Dragon() {
    }

    public void move() {
        String message = messageSource.getMessage("dragon.move", new Object[]{getName()}, "default message", null);
        System.out.println(message);
    }

    protected int getAttackPoints() {
        return concreteFireBreath.getDamagePoints() * (strenghtPoints + 30);
    }

    public FireBreath getConcreteFireBreath() {
        return concreteFireBreath;
    }

    @Autowired
    public void setConcreteFireBreath(FireBreath concreteFireBreath) {
        this.concreteFireBreath = concreteFireBreath;
    }

    public MessageSource getMessageSource() {
        return messageSource;
    }

    @Autowired
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @Override
    @Resource(name = "fireBreath")
    public void setWeapon(Weapon weapon) {
        super.setWeapon(weapon);
    }

}
