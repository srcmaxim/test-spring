package me.srcmaxim;

import me.srcmaxim.characters.Character;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

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
