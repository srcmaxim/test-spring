package me.srcmaxim.weapons;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import sun.plugin2.message.Message;

@Component
public class Sword extends Weapon{

    MessageSource messageSource;

    public Sword(int damagePoints) {
        super(damagePoints);
    }

    public Sword() {
    }

    @Override
    public int getDamagePoints() {
        return Integer.parseInt(messageSource.getMessage("weapon.sword.damagePoints",null,"100",null));
    }


    public MessageSource getMessageSource() {
        return messageSource;
    }

    @Autowired
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

}
