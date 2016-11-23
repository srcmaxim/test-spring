package me.srcmaxim.characters;

import me.srcmaxim.weapons.Weapon;

public abstract class Character {

    protected String name;
    protected Weapon weapon;
    protected int strenghtPoints;
    protected int helthPoints;
    protected int armorPoints;

    public Character(String name, int strenghtPoints, int helthPoints, int armorPoints) {
        this(name);
        this.strenghtPoints = strenghtPoints;
        this.helthPoints = helthPoints;
        this.armorPoints = armorPoints;
    }

    public Character(String name) {
        this.name = name;
    }

    public Character() {
    }

    abstract public void move();

    public void attack(Character character){
        System.out.println("Character " + this.toString() + " attacks " + character.toString());
        character.defend(getAttackPoints());
    }

    protected abstract int getAttackPoints();


    private void defend(int damage){
        int currentDamage = damage - armorPoints;
        helthPoints -= currentDamage;
        if (helthPoints <= 0) System.out.println("Character dead: " + this.toString());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrenghtPoints() {
        return strenghtPoints;
    }

    public void setStrenghtPoints(int strenghtPoints) {
        this.strenghtPoints = strenghtPoints;
    }

    public int getHelthPoints() {
        return helthPoints;
    }

    public void setHelthPoints(int helthPoints) {
        this.helthPoints = helthPoints;
    }

    public int getArmorPoints() {
        return armorPoints;
    }

    public void setArmorPoints(int armorPoints) {
        this.armorPoints = armorPoints;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", weapon=" + weapon.getDamagePoints() +
                ", strenghtPoints=" + strenghtPoints +
                ", helthPoints=" + helthPoints +
                ", armorPoints=" + armorPoints +
                '}';
    }
}
