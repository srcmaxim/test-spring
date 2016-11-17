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

public class World {

    private List<Character> characters;

    public World() {
    }

    public World(List<Character> characters) {
        this.characters = characters;
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }

    @Override
    public String toString() {
        return "World{" +
                "characters=" + characters +
                '}';
    }
}
