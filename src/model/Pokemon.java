package model;

public abstract class Pokemon {
    private int id;
    private String name;
    private Types firstType;
    private Types secondType;
    private int hp;
    private int attack;
    private int defense;
    private int speed;
    private int spAttack;
    private int spDefense;
    private boolean shiny;

    public Pokemon(int id, String name, Types firstType, Types secondType, int hp, int attack, int defense, int speed, int spAttack, int spDefense) {
        this.id = id;
        this.name = name;
        this.firstType = firstType;
        this.secondType = secondType;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.spAttack = spAttack;
        this.spDefense = spDefense;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSpAttack() {
        return spAttack;
    }

    public int getSpDefense() {
        return spDefense;
    }

    public Types getFirstType() {
        return firstType;
    }

    public Types getSecondType() {
        return secondType;
    } 

    public boolean isShiny() {
        return shiny;
    }
}