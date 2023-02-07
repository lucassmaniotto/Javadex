package model;

public class WildPokemon extends Pokemon {
    protected boolean isWild;
    
    public WildPokemon(int id, String name, Types firstType, Types secondType, int hp, int attack, int defense, int speed, int spAttack, int spDefense) {
        super(id, name, firstType, secondType, hp, attack, defense, speed, spAttack, spDefense);
        this.isWild = true;
    }
    
    public boolean getIsWild() {
        return this.isWild;
    }
}