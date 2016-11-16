package me.srcmaxim;

import me.srcmaxim.characters.Character;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        World world = (World) context.getBean("world");

        System.out.println(world);
    }
}
