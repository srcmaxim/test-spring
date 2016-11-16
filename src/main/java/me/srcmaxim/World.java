package me.srcmaxim;

import me.srcmaxim.characters.Character;
import me.srcmaxim.characters.Dragon;
import me.srcmaxim.characters.Warrior;

import java.util.List;

public class World {

    private Warrior warrior;
    private Dragon dragon;

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
    public String toString() {
        return "World{" +
                "warrior=" + warrior +
                ", dragon=" + dragon +
                '}';
    }
}
