package me.srcmaxim;

import me.srcmaxim.characters.Character;

import java.util.List;

public class World {

    private List<Character> characters;

    public World(List<Character> characters) {
        this.characters = characters;
    }

    public World() {
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
