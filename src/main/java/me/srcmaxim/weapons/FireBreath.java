package me.srcmaxim.weapons;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class FireBreath extends Weapon {

    MessageSource messageSource;

    public FireBreath(int damagePoints) {
        super(damagePoints);
    }

    public FireBreath() {
    }

    @Override
    public int getDamagePoints() {
        return Integer.parseInt(messageSource.getMessage("weapon.fireBreath.damagePoints",null,"100",null));
    }

    public MessageSource getMessageSource() {
        return messageSource;
    }

    @Autowired
    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

}
