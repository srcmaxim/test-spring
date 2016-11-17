package me.srcmaxim;

import me.srcmaxim.characters.Character;
import me.srcmaxim.characters.Dragon;
import me.srcmaxim.characters.Warrior;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import sun.net.www.ApplicationLaunchException;

import java.util.Arrays;
import java.util.List;

public class World implements ApplicationContextAware, BeanNameAware{

    private Warrior warrior;
    private Dragon dragon;

    private ApplicationContext applicationContext;
    private String beanName;

    public World() {
    }

    public World(Warrior warrior, Dragon dragon) {
        this.warrior = warrior;
        this.dragon = dragon;
    }

    public Warrior getWarrior() {
        return warrior;
    }

    public void setWarrior(Warrior warrior) {
        this.warrior = warrior;
    }

    public Dragon getDragon() {
        return dragon;
    }

    public void setDragon(Dragon dragon) {
        this.dragon = dragon;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;

        System.out.print("World bean aliases: ");
        String[] worlds = applicationContext.getAliases("world");
        String s = Arrays.stream(worlds).reduce((s1, s2) -> s1 + ", " + s2).get();
        System.out.println(s);
    }

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
        System.out.println("Bean name: " + beanName);
    }

    @Override
    public String toString() {
        return "World{" +
                "warrior=" + warrior +
                ", dragon=" + dragon +
                '}';
    }
}
