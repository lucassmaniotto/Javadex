package model;

/**
 * Classe abstrata que representa um Pokémon.
 */
public abstract class Pokemon {
    private int id;
    private String name;
    private String firstType;
    private String secondType;
    private boolean shiny;
    private int hp;
    private int attack;
    private int defense;
    private int speed;
    private int spAttack;
    private int spDefense;
    private int total;
    private float height;
    private float weight;

    public Pokemon (String name, String firstType, String secondType, int hp, int attack, int defense, int speed, int spAttack, int spDefense, float height, float weight) {
        this.name = name;
        this.firstType = firstType;
        this.secondType = secondType;
        this.shiny = false;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.spAttack = spAttack;
        this.spDefense = spDefense;
        this.total = hp + attack + defense + speed + spAttack + spDefense;
        this.height = height;
        this.weight = weight;
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

    public String getFirstType() {
        return firstType;
    }    
    
    public String getSecondType() {
        return secondType;
    }     
    
    public int getTotal() {
        return total;
    }    
    
    public boolean getShiny() {
        return shiny;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setHp(int hp) {
        this.hp = hp;
    }    
    
    public void setAttack(int attack) {
        this.attack = attack;
    }    
    
    public void setDefense(int defense) {
        this.defense = defense;
    }    
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }    
    
    public void setSpAttack(int spAttack) {
        this.spAttack = spAttack;
    }    

    public void setSpDefense(int spDefense) {
        this.spDefense = spDefense;
    }    
    
    public void setTotal(int total) {
        this.total = total;
    }    
    
    public void setFirstType(String firstType) {
        this.firstType = firstType;
    }    
    
    public void setSecondType(String secondType) {
        this.secondType = secondType;
    }    
    
    public void setShiny(boolean shiny) {
        this.shiny = shiny;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

}