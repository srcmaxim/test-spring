package me.srcmaxim.characters;

import me.srcmaxim.weapons.Sword;
import me.srcmaxim.weapons.Weapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;

@Component
public class Warrior extends Character {

    Sword concreteSword;
    MessageSource messageSource;

    public Warrior(String name, int strenghtPoints, int helthPoints, int armorPoints) {
        super(name, strenghtPoints, helthPoints, armorPoints);
    }

    public Warrior() {
    }

    public void move() {

        String message = messageSource.getMessage("warrior.move", new Object[]{getName()}, "default message", null);
        System.out.println(message);
    }

    @Autowired
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    protected int getAttackPoints() {
        return (concreteSword.getDamagePoints() + 10) * strenghtPoints;
    }


    public Sword getConcreteSword() {
        return concreteSword;
    }

    @Autowired
    public void setConcreteSword( Sword concreteSword) {
        this.concreteSword = concreteSword;
    }

    public MessageSource getMessageSource() {
        return messageSource;
    }

    @Override
    @Resource(name = "sword")
    public void setWeapon(Weapon weapon) {
        super.setWeapon(weapon);
    }
}
