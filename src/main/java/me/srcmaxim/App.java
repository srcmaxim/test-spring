package me.srcmaxim;

import me.srcmaxim.characters.Character;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.start();

        Character characterA = (Character) context.getBean("dragon");
        Character characterB = (Character) context.getBean("warrior");
        characterA.attack(characterB);

        context.registerShutdownHook();
    }
}
