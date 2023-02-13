package model;

public class WildPokemon extends Pokemon {
    protected boolean isWild;
    
    public WildPokemon(String name, String firstType, String secondType, int hp, int attack, int defense, int speed, int spAttack, int spDefense, float height, float weight) {
        super(name, firstType, secondType, hp, attack, defense, speed, spAttack, spDefense, height, weight);
        this.isWild = true;
    }
    

    public boolean getIsWild() {
        return this.isWild;
    }
}