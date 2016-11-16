package me.srcmaxim.weapons;

public abstract class Weapon {

    private int damagePoints;

    public Weapon(int damagePoints) {
        this.damagePoints = damagePoints;
    }

    public Weapon() {
    }

    public int getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints(int damagePoints) {
        this.damagePoints = damagePoints;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "damagePoints=" + damagePoints +
                '}';
    }
}
