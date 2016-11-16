package me.srcmaxim;

import me.srcmaxim.characters.Character;
import me.srcmaxim.characters.Dragon;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        /* We can get warrior by: warrior, warrior-name, warrior-alias */
        /* We can get dragon by: warrior, dragon-name, dragon-alias */

        Character warrior = (Character) context.getBean("warrior");
        Character dragon = (Character) context.getBean("dragon");

        warrior.attack(dragon);
    }
}
