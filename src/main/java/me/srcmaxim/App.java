package me.srcmaxim;

import me.srcmaxim.characters.Character;
import me.srcmaxim.characters.Dragon;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        /*Also you may use BeanFactory factory*/
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Character warrior = (Character) context.getBean("warrior");
        Character dragon = (Character) context.getBean("dragon");

        warrior.attack(dragon);
    }
}
